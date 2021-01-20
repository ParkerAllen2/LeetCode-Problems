package EasyProblems;

public class BinaryLinkedListToInt {
    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 36MB 73%
     */
    public int getDecimalValue(ListNode head) {
        return Recursion(head)[0];
    }

    public int[] Recursion(ListNode head){
        if(head.next == null)
            return new int[]{head.val, 1};

        int[] arr = Recursion(head.next);
        int count = (head.val == 0)? 0 : (int)Math.pow(2, arr[1]);
        return new int[]{count + arr[0], arr[1] + 1};
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
