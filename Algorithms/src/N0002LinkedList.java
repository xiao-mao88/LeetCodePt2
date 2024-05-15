public class N0002LinkedList {
    N0002ListNode head = null;

    public void add (int n){
        N0002ListNode newNode = new N0002ListNode(n);
        if (head == null) {
            head = newNode;
        }

        else{
            N0002ListNode last = head;
            while(last.next!=null){
                last = last.next;
            }

            last.next = newNode;
        }
    }

    public String toString() {
        String retStr = "Contents:\n";

        N0002ListNode current = head;
        while (current != null) {
            retStr += current.getData() + "\n";
            current = current.getNext();

        }
        return retStr;
    }
}
