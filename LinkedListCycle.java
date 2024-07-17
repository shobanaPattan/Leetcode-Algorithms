import model.ListNode;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        ListNode slowpointer = head;
        ListNode fastPointer = head;

        while (slowpointer != null && fastPointer != null && fastPointer.next != null) {

            fastPointer = fastPointer.next.next;
            slowpointer = slowpointer.next;

            if (slowpointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(6);

        //Creating loop
        l1.next.next.next.next = l1.next;

        System.out.println(hasCycle(l1));

    }
}

//Also known as Tortoise and Hare algorithm
//Input : ListNode head, output : Boolean
//Take two pointers, fast and slow assign to head ListNode
//While loop until slow and fast.next reaches null
//Reassign fast with fast.next.next (As it runs twice) and slow with slow.next (As it runs regularly)
//Check the if condition when fast and slow pointers meets if Yes then return true else false

