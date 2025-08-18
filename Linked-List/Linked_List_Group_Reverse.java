/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head == null || head.next == null || k == 1)
            return head;
            
        Node prevNode = head;
        Node currNode = head.next;
        int count = 1;
        
        while(currNode != null && count < k){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            prevNode = currNode;
            currNode = nextNode;
            
            count++;
        }
        
        if(currNode != null)
            head.next = reverseKGroup(currNode, k);
        else
            head.next = null;
            
        return prevNode;
    }
}
