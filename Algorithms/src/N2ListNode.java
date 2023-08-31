public class N2ListNode {
    int val;
    N2ListNode next;
    N2ListNode() {}
    N2ListNode(int val) { this.val = val; }
    N2ListNode(int val, N2ListNode next) { this.val = val; this.next = next; }

    public int getData()
    {
        return val;
    }

    public N2ListNode getNext()
    {
        return next;
    }

    public String toString() {
        String retStr = "" + val;

        N2ListNode current = next;
        while (current != null) {
            retStr += current.getData();
            current = current.getNext();

        }
        return retStr;
    }
}
