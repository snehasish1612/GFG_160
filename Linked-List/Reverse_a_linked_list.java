/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null || head.next == null)
            return head;
            
        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            //Update
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head.next = null;
        head = prevNode;
        
        return head;
    }
}
