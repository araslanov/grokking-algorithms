package main.java.com.wizeek.grokking_algorithms;

/**
 * Calculates the number of items in a (linked) list recursively.
 */
class Exercise_4_2 {
    public static void main(String[] args) {
        List list = new List();
        list.add();
        list.add();
        list.add();
        System.out.println("Size is: " + size(list));
    }

    private static int size(List list) {
        Node nextNode = list.getFirst().next;
        if (nextNode == null) {
            return 1;
        } else {
            return 1 + size(new List(nextNode));
        }
    }

    private static final class List {
        private Node head;
        private Node last;

        List() {
        }

        List(Node head) {
            this.head = head;
        }

        void add() {
            if (last == null) {
                head = new Node();
                last = head;
            } else {
                last.next = new Node();
                last = last.next;
            }
        }

        Node getFirst() {
            return head;
        }
    }

    private static final class Node {
        Node next;
    }
}