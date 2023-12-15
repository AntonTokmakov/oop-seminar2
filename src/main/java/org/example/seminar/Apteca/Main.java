package org.example.seminar.Apteca;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent azitroment1 = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);
        PharmancyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        //System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        //System.out.println(pharmancyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(pinicilin).addComponent(water2).addComponent(water);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(water).addComponent(azitroment).addComponent(pinicilin);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(water).addComponent(azitroment).addComponent(pinicilin);


        Set<Pharmacy> pharmacies = new HashSet<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        pharmacies.add(pharmacy4);

        System.out.println("////Вывод Set. В Set добавлено 4 элемента, один дубль");
        System.out.println("Количество уникальных элементов Set: " + pharmacies.size());

        List<Pharmacy> pharmaciesList = new ArrayList<>();
        pharmaciesList.add(pharmacy1);
        pharmaciesList.add(pharmacy2);
        pharmaciesList.add(pharmacy3);

        System.out.println("Сортировка происходит по кол-ву компонентов в таблетке");
        System.out.println("///////////Вывод не отсортированного массива таблеток/////////////");
        System.out.println(pharmaciesList);

        Collections.sort(pharmaciesList);

        System.out.println("///////////Вывод отсортированного массива таблеток/////////////");
        System.out.println(pharmaciesList);

        Set<PharmancyComponent> set = new HashSet<>();
        set.add(azitroment);
        set.add(azitroment1);
        set.add(azitroment);

//        System.out.println("/////////////////////////");
//        System.out.println(set);

        //Collections.sort(pharmacies, new );

        //Iterator<PharmancyComponent> iterator = pharmacy1;

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while (((Iterator<PharmancyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmancyComponent>) pharmacy1).next());
//        }

    }
}
