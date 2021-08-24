// 0083. Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode list = head;
        while(list.next != null) {
             if (list.val == list.next.val)
                 list.next = list.next.next;
             else 
                 list = list.next;
        }
        
        return head;
    }
}