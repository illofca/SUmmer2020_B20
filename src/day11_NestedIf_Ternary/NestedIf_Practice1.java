package day11_NestedIf_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
        double salary = 120000;
        int jobHistory = 5;


        if(salary>=30000){
            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else{
                System.out.println("You mus have at least 2 year job history");
            }

        }else{
            System.out.println("You must earn at least 30K");
        }
    }


}
