/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
} */

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null || k == 0)
            return head;
            
        Node temp = head;
        int length = 1;
        
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        
        k = k % length;
        
        if(k == 0)
            return head;
        
        temp.next = head;
        temp = head;
        
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }
        
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}
