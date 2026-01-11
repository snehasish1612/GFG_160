/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    void result(Node root, ArrayList<Integer> list){
        if(root == null)
            return;
            
        result(root.left, list);
        list.add(root.data);
        result(root.right, list);
    }
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        result(root, list);
        return list;
    }
}
