package day37_ArrayList;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000));


        //maximum number :

        Integer max = Collections.max(list);

        // minimum number :
        Integer min = Collections.min(list);

        System.out.println("maximum number : "+ max);
        System.out.println("minimum number : "+ min);


        System.out.println("==================================");

        // replaceAll

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Izzet", "Seyla", "Huma", "Batur", "Emiralp", "Muhtar", "Muhtar"));
        Collections.replaceAll(names,"Muhtar", "Hatice");

        System.out.println(names);



    }
}
