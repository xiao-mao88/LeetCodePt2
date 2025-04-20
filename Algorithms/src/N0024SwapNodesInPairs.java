/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes
 * (i.e., only nodes themselves may be changed.)
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
 * Memory Usage: 41.82 MB, less than 5.60% of Java online submissions for Swap Nodes in Pairs.
 */
public class N0024SwapNodesInPairs {
  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }
    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      StringBuilder res = new StringBuilder();
      ListNode toPrint = this;
      while(toPrint != null) {
        res.append(toPrint.val).append(" ");
        toPrint = toPrint.next;
      }
      return res.toString();
    }
  }

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode result = new ListNode(0);
    ListNode curr = result;
    while (head != null) {
      ListNode temp = head.next;
      if (head.next != null && temp.next != null) {
        head.next = temp.next;
        temp.next = head;
        curr.next = temp;
        curr = curr.next.next;
      }
      else if (head.next != null) {
        head.next = null;
        temp.next = head;
        curr.next = temp;
        curr = curr.next;
      }
      head = head.next;
    }
    return result.next;
  }
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    System.out.println(head);
    System.out.println(swapPairs(head));
  }
}
