/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
Memory Usage: 41.88 MB, less than 44.28% of Java online submissions for Remove Nth Node From End of List.
 */

public class N0019RemoveNthNodeFromEndOfList {

  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }
    ListNode(int val, ListNode next) {
      this.val = val; this.next = next;
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

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode result = new ListNode(0, head);
    ListNode temp = result;

    for (int i = 0; i < n; i++) {
      head = head.next;
    }

    while (head != null) {
      temp = temp.next;
      head = head.next;
    }

    temp.next = temp.next.next;

    return result.next;
  }

  public static void main(String[] args) {
    ListNode five = new ListNode(5);
    ListNode four = new ListNode(4, five);
    ListNode three = new ListNode(3, four);
    ListNode two = new ListNode(2, three);
    ListNode one = new ListNode(1, two);

    System.out.println(removeNthFromEnd(one, 4));
  }
}
