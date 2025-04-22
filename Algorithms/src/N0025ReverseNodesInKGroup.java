/**
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in K Group.
 * Memory Usage: 44.64 MB, less than 22.95% of Java online submissions for Reverse Nodes in K Group.
 *
 * Space complexity (according to leetcode is O(1))
 */
public class N0025ReverseNodesInKGroup {
  static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

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

  public static ListNode reverseKGroup(ListNode head, int k) {
    if (head==null || head.next == null || k == 1) return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode temp = head;
    int count = 1;
    ListNode first = temp;
    while (head != null) {
      if (count % k == 0) {
        ListNode next = head.next;
        head.next = null;
        if (count / k == 1) {
          dummy.next = reverseListNodes(temp);
        }
        else {
          first.next = reverseListNodes(temp);
          first = temp;
        }
        temp = next;
        head = next;
      }
      else {
        head = head.next;
      }
      count++;
    }
    first.next = temp;
    return dummy.next;
  }

  public static ListNode reverseListNodes(ListNode head) {
    ListNode result = new ListNode(0);
    while (head != null) {
      ListNode currNode = head;
      head = head.next;
      currNode.next = result.next;
      result.next = currNode;
    }
    return result.next;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    System.out.println(head);
    System.out.println(reverseKGroup(head, 2));
  }
}
