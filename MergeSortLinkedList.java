import model.ListNode;

import java.util.List;

class MergeSortLinkedList {

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);

        ListNode curr = dummyNode;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                dummyNode.next = l1;
                l1 = l1.next;
            } else {
                dummyNode.next = l2;
                l2 = l2.next;
            }
            dummyNode = dummyNode.next;
        }

        if (l1 == null) {
            dummyNode.next = l2;
        } else {
            dummyNode.next = l2;
        }
        return curr.next;
    }

    // A utility function to print linked list
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

//        ListNode l3 = new ListNode(4);
//        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

//        ListNode l6 = new ListNode(4);
//        ListNode l5 = new ListNode(3, l6);
        ListNode l4 = new ListNode(1);
        l4.next = new ListNode(3);
        l4.next.next = new ListNode(5);

        ListNode mergeHead = mergeTwoLists(l1, l4);
        printList(mergeHead);

    }
}

//Input - Two linked list, output - Sorted linked list
//Create an empty node(Dummy) to start the sorting
//Create another node and assign dummy node to this, to iterate while solving the problem
//While loop to check both lists are not null
//Compare between both lists which is smaller, then start adding to dummy node
//Check if both lists are null if not add the remaining nodes to dummy list