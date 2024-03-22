package String;

public class P16_onli {
    public static void main(String[] args) {
        String result = "";
        String s = "dhruvin dhameliya";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
//            System.out.print(currentChar);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
//            System.out.println();
//            System.out.println(result);
//            System.out.print(result.indexOf(currentChar));
//            System.out.println();
        }
        System.out.println(result);
    }
}
