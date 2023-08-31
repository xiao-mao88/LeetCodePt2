public class N2LinkedList {
    N2ListNode head = null;

    public void add (int n){
        N2ListNode newNode = new N2ListNode(n);
        if (head == null) {
            head = newNode;
        }

        else{
            N2ListNode last = head;
            while(last.next!=null){
                last = last.next;
            }

            last.next = newNode;
        }
    }

    public String toString() {
        String retStr = "Contents:\n";

        N2ListNode current = head;
        while (current != null) {
            retStr += current.getData() + "\n";
            current = current.getNext();

        }
        return retStr;
    }
}
