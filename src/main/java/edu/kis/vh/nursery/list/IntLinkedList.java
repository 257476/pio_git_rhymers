package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_STACK = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
<<<<<<< accessory-hermetization
            return -1;
        return last.getValue();
=======
            return EMPTY_STACK;
        return last.value;
>>>>>>> master
    }

    public int pop() {
        if (isEmpty())
<<<<<<< accessory-hermetization
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
=======
            return EMPTY_STACK;
        int ret = last.value;
        last = last.prev;
>>>>>>> master
        return ret;
    }

}
