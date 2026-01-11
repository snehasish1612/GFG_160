/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node curr = q.remove();
            
            if(curr == null){
                result.add(list);
                
                if(q.isEmpty())
                    break;
                
                list = new ArrayList<>();    
                q.add(null);
            }else{
                list.add(curr.data);
                
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        
        return result;
    }
}
