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
    public ListNode reverseList(ListNode head) {
        Stack <Integer> st = new Stack<>();
        while(head!=null)
        {
            st.push(head.val);
            head=head.next;
        }
        ListNode rev = new ListNode(Integer.MIN_VALUE);
        ListNode pointer=rev;

        while(!st.isEmpty())
        {
            pointer.next=new ListNode(st.pop());
            pointer=pointer.next;
        }
        return rev.next;

    }
}