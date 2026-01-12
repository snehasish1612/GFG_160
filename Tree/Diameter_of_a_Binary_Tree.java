//Approach: 1 [O(n^2)]

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    
    public int height(Node root){
        if(root == null)
            return -1;
            
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public int diameter(Node root) {
        // code here
        if(root == null)
            return 0;
            
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) + 2;
        
        return Math.max(d3, Math.max(d1, d2));
    }
}



//Approach: 2 [O(n)]
/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */



class Solution {
    
    int maxDiam = 0;
    
    public int height(Node root){
        if(root == null)
            return -1;
            
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        maxDiam = Math.max(maxDiam, leftHeight + rightHeight + 2);
        
        return Math.max(leftHeight, rightHeight) + 1;
        
    }
    
    public int diameter(Node root) {
        // code here
        height(root);
        
        return maxDiam;
    }
}
