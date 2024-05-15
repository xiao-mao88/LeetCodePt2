public class N0002ListNode {
    int val;
    N0002ListNode next;
    N0002ListNode() {}
    N0002ListNode(int val) { this.val = val; }
    N0002ListNode(int val, N0002ListNode next) { this.val = val; this.next = next; }

    public int getData()
    {
        return val;
    }

    public N0002ListNode getNext()
    {
        return next;
    }

    public String toString() {
        String retStr = "" + val;

        N0002ListNode current = next;
        while (current != null) {
            retStr += current.getData();
            current = current.getNext();

        }
        return retStr;
    }
}
