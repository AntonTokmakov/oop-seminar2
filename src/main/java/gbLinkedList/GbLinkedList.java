package gbLinkedList;

import GbList.GbList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public class GbLinkedList<T>/* implements Iterable<T>*/ {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public boolean add(T element) {
        if (first == null) {
            first = new Node(element);
            last = first;
            size++;
            return false;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        last = temp.next;
        last.prev = temp;
        size++;
        return false;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            Node node = new Node(element);
            first.prev = node;
            node.next = first;
            first = node;
            size++;
            return;
        }
        if (index == size()) {
            add(element);
            return;
        }
        Node temp = getNode(index);

        Node node = new Node(element);
        temp.next.prev = node;
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        Node temp = getNode(index);
        return (T) temp.data;
    }

    private Node getNode(int index) {
        int i;
        Node temp;
        if (index < size()/2) {
            i = 0;
            temp = first;
            while (i != index) {
                temp = temp.next;
                i++;
            }
        } else {
            i = size() - 1;
            temp = last;
            while (i != index) {
                temp = temp.prev;
                i--;
            }
        }
        return temp;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public T removeFirst() {
        if (first == null) {
            throw new UnsupportedOperationException("Лист пустой");
        } else if (last == first) {
            size--;
            Node temp = first;
            first = last = null;
            return (T) temp.data;
        }
        Node temp = first;
        first = first.next;
        first.prev = null;
        size--;
        return (T) temp.data;
    }

    public void update(int index, T value) {
        checkIndex(index);
        Node temp = getNode(index);
        temp.data = value;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Выход за границы массива");
        }
    }

    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(){}

        public Node(T data) {
            this.data = data;
        }
    }

}
