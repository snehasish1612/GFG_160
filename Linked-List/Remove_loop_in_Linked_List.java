/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node hare = head;
        Node turtle = head;
        
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle){
                turtle = head;
                
                while(hare != turtle){
                    hare = hare.next;
                    turtle = turtle.next;
                }
                
                while(hare.next != turtle){
                    hare = hare.next;
                }
                
                hare.next = null;
            }
        }
    }
}
