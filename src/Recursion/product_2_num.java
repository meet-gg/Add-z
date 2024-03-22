package Recursion;

public class product_2_num {
    public static void main(String[] args) {
        int a=25;
        int b=40;
        System.out.println(product(a,b));
    }

    private static int product(int a, int b) {
        if (b==0){
            return 0;
        }
        return a + product(a,b-1);
    }

}
