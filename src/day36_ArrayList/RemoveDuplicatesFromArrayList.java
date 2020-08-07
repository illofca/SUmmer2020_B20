package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A', 'B','B','C', 'C'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();

        for(Character each : list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }else{
                continue;
            }
        }
        System.out.println(nonDup);


    }

}
