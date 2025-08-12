
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode Curr = head;
        ListNode prev = null;

        while(Curr!=null){
            ListNode ne = Curr.next;
            Curr.next = prev;

            prev = Curr;
            Curr = ne;

        }
        return prev;


        
    }
}