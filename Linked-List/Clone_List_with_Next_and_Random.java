/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node tempOriginal = head;
        Node cloneHead = new Node(head.data);
        Node tempClone = cloneHead;
        
        Map<Node, Node> map = new HashMap<>();  
        
        while(tempOriginal.next != null){
            Node newNode = new Node(tempOriginal.next.data);
            tempClone.next = newNode;
            
            map.put(tempOriginal, tempClone);
            
            tempOriginal = tempOriginal.next;
            tempClone = tempClone.next;
        }
        
        map.put(tempOriginal, tempClone);
        
        tempOriginal = head;
        tempClone = cloneHead;
        
        while(tempOriginal != null){
            tempClone.random = map.get(tempOriginal.random);
            tempClone = tempClone.next;
            tempOriginal = tempOriginal.next;
        }
        
        return cloneHead;
    }
}
