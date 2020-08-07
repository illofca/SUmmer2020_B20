package day28_Recap;

public class MultiD_Array_Practice1 {
    public static void main(String[] args) {
        String[] group11 = {"Izzet", "Noza", "Nese", "Akbar", "Akram", "Anastasia", "Heydar" };
        String[] group12 ={"Aalia", "Noza", "Bulent", "Burak", "Ebrahim", "Musa" };
        String[] group13 = {"Heydar", "Selman", "Rustam", "Murat", "Makhmud", "Aysen"};
        String [] group14 = {"Menekse", "Rustam", "Semra", "Sumeyra", "Guzel"};
        String[] group15 ={"Ali", "Muhtar", "Dardan", "Kadir", "Emir", "Huma" };

        String[][] Batch20 = {group11, group12, group13, group14, group15};

        for(int i=0; i<=Batch20.length-1; i++){
            String[] eachGroup = Batch20[i];

            for( int j=0; j<=eachGroup.length-1;j++){
                String eachStudent =eachGroup[j];
                if(eachStudent.toLowerCase().contains("m")){
                    System.out.print(eachStudent+" ");
                }
            }
            System.out.println();
        }
    }






}
