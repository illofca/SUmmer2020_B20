package day36_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*
    indexOf()
    lastIndexOf()
    contains()
    equals()
    isEmpty()
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(40);
        list.add(50);
//indexOf
        int a = list.indexOf(40);
        System.out.println(a);

        System.out.println(list.indexOf(60));// not exist in the list so it will print -1
//lastIndexOf
        int b = list.lastIndexOf(40);
        System.out.println(b);

        //contains
        boolean r1 = list.contains(100);//100 is not in the list so it'll print false
        System.out.println(r1);

        System.out.println("================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek School");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        System.out.println(list3.isEmpty());




    }


}
