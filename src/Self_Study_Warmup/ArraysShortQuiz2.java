package Self_Study_Warmup;

import java.util.Arrays;

public class ArraysShortQuiz2 {
    public static void main(String[] args) {
        //Q9
        int arr[]={1,2,3,4};
        int i=0;
        do{
            System.out.println(arr[i]+" ");
            i++;
        }while (i<arr.length-1);

        System.out.println("============");
        //Q3
        char[] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);// arr:{A, B, C, D}

        for(char each: array){
            System.out.print(each+" ");
            if (each=='D'){
                continue;


            }

        }
        System.out.println();
        System.out.println("==========================");
        //Q4

        int wd=0; // 0 -1+1+2+2-1 =3
        String[] days = {"sun", "mon", "wed", "sat"};
        for(int is = 0; is < days.length; is++){

            switch(days[is]){
                case"sat" :
                case "sun":
                    wd -= 1;
                    break;// will exit the switch not the loop
                case "mon":
                    wd++;
                case "wed":
            }
        }

        int[] nums = {15,30,45,60, 70};
        //            0  1  2   3   4

        nums[2]=nums[4]; //{15,30,75,60,75}
       // nums[2] =75;
        nums[4]=90;
        System.out.println(Arrays.toString(nums));

        System.out.println("==================================");
        //q9
        int[] a ={1,2,3,4};
        int y =0;
        do {
            System.out.println(arr[y]);
            y++;
        }while (y< a.length-1);



            }
        }



