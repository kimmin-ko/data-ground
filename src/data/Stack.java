package data;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack<T> {

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if(Objects.isNull(top))
            throw new EmptyStackException();

        T item = top.data;
        top = top.next;

        return item;
    }

    public void push(T item) {
        Node<T> node = new Node<>(item);

        node.next = top;
        top = node;
    }

    public T peek() {
        if(Objects.isNull(top))
            throw new EmptyStackException();

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.isEmpty());
    }

}
