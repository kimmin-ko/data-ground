package data;

import java.util.LinkedList;

import static java.lang.String.*;

public class HashTable {

    private final LinkedList<Node>[] data;

    static class Node {
        private final String key;
        private String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public HashTable() {
        this(3);
    }

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    private int getHashCode(String key) {
        int hashCode = 0;
        for (char c : key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }

    private int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    private Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;

        for (Node node : list) {
            if(node.key.equals(key))
                return node;
        }
        return null;
    }

    public void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        System.out.println(format("%s: hashCode(%d), index(%d)", key, hashCode, index));

        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }

}