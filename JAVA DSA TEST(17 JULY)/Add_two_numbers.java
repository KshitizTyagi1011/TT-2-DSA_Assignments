import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Add_two_numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;

            current.next = new ListNode(sum);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first linked list
        System.out.print("Enter the length of the first linked list: ");
        int n = scanner.nextInt();
        ListNode l1 = new ListNode(scanner.nextInt());
        ListNode current = l1;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        // Input the second linked list
        System.out.print("Enter the length of the second linked list: ");
        int m = scanner.nextInt();
        ListNode l2 = new ListNode(scanner.nextInt());
        current = l2;
        for (int i = 1; i < m; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        // Reverse the linked lists
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);

        // Add the two linked lists
        ListNode result = addTwoNumbers(l1, l2);

        // Reverse the result
        result = reverseLinkedList(result);

        // Print the output linked list
        System.out.println("Output Linked List:");
        printLinkedList(result);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
