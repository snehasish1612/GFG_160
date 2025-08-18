/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    static Node addTwoLists(Node head1, Node head2) {
        // code here
        while(head1.data == 0){
            head1 = head1.next;
        }
        while(head2.data == 0){
            head2 = head2.next;
        }
        
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node head = addition(head1, head2);
        
        head = reverse(head);
        
        return head;
    }
    
    static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node prev = head;
        Node curr = head.next;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head.next = null;
        return prev;
    }
    
    static Node addition(Node head1, Node head2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        
        while(head1 != null || head2 != null || carry != 0){
            int sum = carry;
            
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }
            
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
