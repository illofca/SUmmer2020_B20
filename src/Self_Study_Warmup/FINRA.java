package Self_Study_Warmup;

public class FINRA {
    public static void main(String[] args) {
        String result ="";
        for(int i=1; i<=100; ++i){
            System.out.print((i%3==0 && i%5 ==0)? " FINRA":(i%3 ==0)? " FIN": (i%5==0)? " RA": " "+i);

        }

    }
}
