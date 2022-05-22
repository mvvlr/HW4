package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        mans();
        mains();
        ArrayList<String> listA = new ArrayList<>();
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                listA.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                listB.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Collections.reverse(listB);
        ArrayList<String> dlist = new ArrayList<>();
        ListIterator<String> Iterb = listB.listIterator();
        ListIterator<String> Itera = listA.listIterator();
        for (int i = 0; i < listA.size(); i++) {
            dlist.add(Itera.next());
            dlist.add(Iterb.next());
        }

        System.out.println("Отсортирован-");
        System.out.println(dlist);
        System.out.println("Отсортирован-");
        dlist.sort(new LengthFirstComparator());
        System.out.println(dlist);


    }

    public static void mans() {
        ArrayList<String> states = new ArrayList<>();
        states.add("Кыргызстан");
        states.add("Казахстан");
        states.add("Таджикистан");
        states.add("Узбекистан");
        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
        listIter.set("Туркменистан");
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
            listIter.remove();
        }
    }


    public static void mains() {
        List<String> arrayList = Arrays.asList("A", "B", "C", "D");

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+++");
            System.out.print(element + " ");
        }

        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element);
        }
    }
}