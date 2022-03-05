package com.linkedlist;

public class ListNode {
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

    public void display() {
        ListNode head = this;
        if (head == null)
            System.out.println("Empty list");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.print(" -> END\n");
            }
            head = head.next;
        }
    }

}
