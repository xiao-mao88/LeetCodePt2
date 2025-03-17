/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes
of the first two lists.

Return the head of the merged linked list.

Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 42.64 MB, less than 45.16% of Java online submissions for Merge Two Sorted Lists.
 */

public class N0021MergeTwoSortedLists {
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

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    while(list1 != null && list2 != null) {
      if(list1.val < list2.val) {
        curr.next = list1;
        list1 = list1.next;
      }
      else {
        curr.next = list2;
        list2 = list2.next;
      }
      curr = curr.next;
    }
    if(list1 != null) {
      curr.next = list1;
    }
    if(list2 != null) {
      curr.next = list2;
    }
    return dummyHead.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    ListNode l6 = new ListNode(6);
    l1.next = l2;
    l2.next = l3;

    l4.next = l5;
    l5.next = l6;

    System.out.println(mergeTwoLists(l1, l4));
  }
}
