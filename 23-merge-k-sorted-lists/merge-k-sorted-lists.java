class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }
        return result;
    }
    ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }
        if (a != null)
            current.next = a;
        else
            current.next = b;

        return dummy.next;
    }
}