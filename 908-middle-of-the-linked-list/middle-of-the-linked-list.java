
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode Slow = head;
        ListNode Fast = head;

        while(Fast!=null && Fast.next!=null){
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return Slow;
        
    }
}