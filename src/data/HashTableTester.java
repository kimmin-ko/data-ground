package data;

public class HashTableTester {

    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "She is pretty.");
        h.put("jin", "She is model.");
        h.put("hee", "She is angel.");
        h.put("min", "She is cute.");
        h.put("sung", "She is beautiful.");

        System.out.println("h.get(\"sung\") = " + h.get("sung"));
        System.out.println("h.get(\"jin\") = " + h.get("jin"));
        System.out.println("h.get(\"hee\") = " + h.get("hee"));
        System.out.println("h.get(\"min\") = " + h.get("min"));
        System.out.println("h.get(\"kim\") = " + h.get("kim"));
    }

}
