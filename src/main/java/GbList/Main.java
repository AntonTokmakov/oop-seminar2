package GbList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        GbList<String> list = new GbArrayList<String>().add("ddd");
//        System.out.println(list.isEmpty());
//        System.out.println(list);
//        list.add("А").add("В").add("С").add("Д");
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        list.update("R", 0);
//        System.out.println(list);

        GbList<Integer> list = new GbArrayList<Integer>().add(560);
        System.out.println(list.remove(1));

    }

}
