package Homework.listed;

public class LinkedLict {
    Node head;

    public void addFirst(int element) {
        Node node = new Node(element);
        node.setNext(head);
        head = node;
    }

    public void add(int position, int element) {
        Node node = new Node(element); // Create new node

        Node tempNode = head; // Make a temporary node the same as the first node in the list

        if (position == 0) {
            addFirst(element);
            return;
        }

        for (int i = 0; i < position - 1; i++) {
            tempNode = tempNode.getNext();  // Loop over the nodes until we reach the desired position
        }

        node.setNext(tempNode.getNext());
        tempNode.setNext(node);
    }

    public void addLast(int element) {
        Node node = new Node(element);

        Node tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }

        tempNode.setNext(node);
    }

    public int get(int index) {
        if (head == null) {
            return 0;
        }

        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }

        return tempNode.getValue();
    }

    public int getFirst() {
        if (head == null) {
            return 0;
        }
        return head.getValue();
    }

    public int getLast() {
        if (head == null) {
            return 0;
        }

        Node tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }

        return tempNode.getValue();

    }

    public boolean contains(int element) {
        boolean result = false;

        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.getValue() == element) {
                result = true;
                break;
            }
            tempNode = tempNode.getNext();
        }

        return result;
    }

    public int indexOf(int element) {
        int index = 0;

        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.getValue() == element) {
                return index;
            }

            tempNode = tempNode.getNext();
            index++;
        }

        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;

        Node tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }

        return size;
    }

    public void removeAll() {
        head = null;
    }

    public void removeAtIndex(int index) {
        if (head == null) {
            return;
        } else if (index == 0) {
            head = head.getNext();
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.getNext();
        }

        Node nextNode = tempNode.getNext().getNext();
        tempNode.setNext(nextNode);
    }

    public void removeElement(int element) {
        if (head == null) {
            return;
        }

        int index = 0;

        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.getValue() == element) {
                removeAtIndex(index);
            }

            tempNode = tempNode.getNext();
            index++;
        }
    }

    public void print() {
        Node tempNode = head;

        while (tempNode != null) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNext();
        }
    }

}