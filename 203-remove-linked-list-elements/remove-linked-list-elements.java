/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;

        // jb tk head null nai hota tb tk to karenge hi or check krenge kya head ka value = value h
        //agar h toh head ko aage badha denge head.next se which will be new head;
        while(head != null && head.val==val){
            head = head.next;
        }

        ListNode current = head;

        while(current != null && current.next != null){
            if(current.next.val == val){
            current.next = current.next.next;   
            }else{
            current = current.next;
            }
            
        }
        return head;
    }  
    
}