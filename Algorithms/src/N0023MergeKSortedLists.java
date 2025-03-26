/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Runtime: 86 ms, faster than 9.60% of Java online submissions for Merge K Sorted Lists.
Memory Usage: 44.27 MB, less than 89.76% of Java online submissions for Merge K Sorted Lists.
 */

public class N0023MergeKSortedLists {
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

  public static ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    ListNode dummyHead = lists[0];
    for (int i = 1; i < lists.length; i++) {
      dummyHead = mergeTwoLists(dummyHead, lists[i]);
    }
    return dummyHead;
  }

  private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    if (list2 == null) {
      return list1;
    }
    else if (list1 == null) {
      return list2;
    }
    while(list1 != null && list2 != null) {
      if(list1.val <= list2.val) {
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
    ListNode empty = new ListNode();
    ListNode one = new ListNode(1);
    ListNode two = new ListNode(2);

    ListNode five = new ListNode(5);
    ListNode four = new ListNode(4, five);
    ListNode list1 = new ListNode(1, four);

    ListNode four2 = new ListNode(4);
    ListNode three = new ListNode(3, four2);
    ListNode list2 = new ListNode(1, three);

    ListNode six = new ListNode(6);
    ListNode list3 = new ListNode(2, six);

    ListNode[] list = {null, one};
    ListNode[] nodeList = {list1, list2, list3};

    System.out.println(mergeKLists(list));
    System.out.println(mergeKLists(nodeList));
  }
}
