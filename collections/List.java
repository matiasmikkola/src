package collections;

import java.util.ArrayList;

public class List {


    // happy path

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Hello");
        list1.add("How are you?");
        list1.add("I am good!");

        System.out.println(list1.get(2));

    // Nasty paths

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("-0");
        list2.add(null);

        System.out.println(list2);

    }
}