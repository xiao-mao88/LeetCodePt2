/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class N0002AddTwoNumbers {

    public static N0002ListNode addTwoNumbers(N0002ListNode l1, N0002ListNode l2) {
        N0002ListNode temp = new N0002ListNode(0);
        N0002ListNode head = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry>0 ) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry=sum/10;

            sum %=10;

            head.next = new N0002ListNode(sum);

            head = head.next;


        }

        return temp.next;
    }

    public static void main (String[] args){
        N0002LinkedList trial1 = new N0002LinkedList();
        trial1.add(2);
        trial1.add(4);
        trial1.add(3);

        N0002LinkedList trial2 = new N0002LinkedList();
        trial2.add(5);
        trial2.add(6);
        trial2.add(4);
        System.out.println(addTwoNumbers(trial1.head, trial2.head));
    }
}
