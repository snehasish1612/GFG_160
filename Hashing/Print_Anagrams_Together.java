class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String , ArrayList<String>> map = new HashMap<>();
        
        for(String word : arr){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
