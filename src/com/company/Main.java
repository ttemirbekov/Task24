package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

       /* 0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
                Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.*/

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] int1 = new int[10];
        randomNum(random, int1, linkedList, arrayList);
        LinkedList<Integer> sortLinked = test(linkedList);

        ArrayList<Integer> sortArrayList = test(arrayList);
        System.out.println("Array: ");
        forEachElementary(test(int1));
        System.out.println();
        System.out.println("Sorted arrayList: " + sortArrayList);
        System.out.println("Sorted linkedList: " + sortLinked);

    }

    private static void forEachElementary(int[] int1) {
        for (int integer : int1) {
            System.out.print(integer + " ");
        }
    }

    static void randomNum(Random random, int[] int1, LinkedList<Integer> linkedList, ArrayList<Integer> arrayList) {

        for (int i = 0; i < int1.length; i++) {
            int1[i] = random.nextInt(2);
            linkedList.add(random.nextInt(2));
            arrayList.add(random.nextInt(2));

        }
    }

    private static LinkedList<Integer> test(LinkedList<Integer> linkedList) {
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return linkedList;
    }

    private static ArrayList<Integer> test(ArrayList<Integer> arrayList) {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return arrayList;
    }

    private static int[] test(int[] int1) {
        for (int i = int1.length - 1; i > 0; i--) {
            for (int j = 0; j < 1; j++) {
                int counter = int1[j];
                int1[j] = int1[j + 1];
                int1[j + 1] = counter;

            }
        }

        return int1;
    }
}


