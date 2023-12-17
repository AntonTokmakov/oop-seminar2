package gbLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GbLinkedList<String> arr = new GbLinkedList<>();

        arr.add("Иван");
        arr.add("Иван1");
        arr.add("Иван2");
        arr.add("Иван3");

        arr.print();

        arr.get(1);

        arr.update(1, "Иван12345");
        arr.print();

        arr.removeFirst();
        arr.print();

        System.out.println(arr.size());
    }
}
