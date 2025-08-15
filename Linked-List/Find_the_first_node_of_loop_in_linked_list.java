// User function Template for Java

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node hare = head;
        Node turtle = head;
        
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle){
                turtle = head;
                while(turtle != hare){
                    turtle = turtle.next;
                    hare = hare.next;
                }
        
                return turtle;
            }
        }
        
        return null;
    }
}
