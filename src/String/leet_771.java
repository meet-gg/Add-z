package String;

public class leet_771 {
    public static void main(String[] args) {
        String  jewels = "aA";
        String stones = "aAAbbbb";
        int count=0;
        char[] c=stones.toCharArray();
        for (int i=0;i<c.length;i++) {
            System.out.println(jewels.indexOf(c[i]));
            if(jewels.indexOf(c[i])!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
