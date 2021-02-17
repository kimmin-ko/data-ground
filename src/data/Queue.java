package data;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    public void add(T item) {
        final Node<T> t = new Node<>(item);

        if (last != null) last.next = t;

        last = t;

        if (isEmpty()) first = t;
    }

    public T remove() {
        if (isEmpty()) throw new NoSuchElementException();

        T item = first.item;
        first = first.next;

        if (isEmpty()) last = null; // 값이 1개일 경우 first와 last는 같은 객체를 가리키기 때문에 first가 remove되면 last도 remove

        return item;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException();

        return first.item;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
