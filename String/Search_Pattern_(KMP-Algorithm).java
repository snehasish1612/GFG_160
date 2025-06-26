// User function Template for Java

class Solution {
    
    //Function to find all the occurence of the pattern in the text
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();  //Stores the starting indexes of matched pattern
        
        int m = pat.length();
        int n = txt.length();
        
        //Step 1: Compute the LPS [Longest Prefix Suffix] array for the pattern
        int[] lps = computeLPS(pat);
        
        int i = 0;  //pointer for txt
        int j = 0;  //pointer for pat
        
        //Step 2: Traverse the txt and use lps array to match the pattern
        while(i < n){
            //If characters match, move both pointers
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            
            //If entire pattern is matched
            if(j == m){
                //Add starting index of the match to result
                result.add(i - j);
                //Move j to the previous lps position
                j = lps[j - 1];
            }
            
            //If mismatch after j > 0 matches
            else if(i < n && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    //Move j to the last known lps 
                    j = lps[j - 1];
                }else{
                    //If j is already 0, move i forward
                    i++;
                }
            }
        }
        
        return result;
    }
    
    //Function to compute LPS array
    int[] computeLPS(String pat){
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;    //Length of previous longest prefix suffix
        int i = 1;  //Start from second character
        
        //Loop through the pattern
        while(i < m){
            //If current character matches the character at the current prefix end
            if(pat.charAt(i) == pat.charAt(len)){
                len++;  //Increase the prefix length
                lps[i] = len;   //Set lps for this index
                i++;    //Move the next character
            }else{
                //Mismatch after len > 0
                if(len != 0){
                    //Try the shorter previous prefix
                    len = lps[len - 1];
                }else{
                    //If no prefix match, set lps[i] = 0
                    lps[i] = 0;
                    i++;
                }
            }
            
        }
        
        return lps;
    }
}
