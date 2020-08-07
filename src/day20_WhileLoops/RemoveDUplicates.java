package day20_WhileLoops;
/*
write a program that can remove the duplicates from any given String
Ex:
input: abcabcaabb
output: abc
*/
public class RemoveDUplicates {
    public static void main(String[] args) {
        String str = "aabb"; // "ab"
        //             0123

        String result = "";

        for (int i = 0; i <= str.length() - 1; i += 1) {

            String s = "" + str.charAt(i);

            if (!result.contains(s)) {
                result += s;
            }


        }
        System.out.println(result);
    }
}
