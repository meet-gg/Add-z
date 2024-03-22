package String;

public class leet1859 {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
                String[] temp = s.split(" ");
                String[] st = new String[temp.length];

                for (int i = 0; i < temp.length; i++) {
                    String x = temp[i];
                    int index = Character.getNumericValue(x.charAt(x.length()-1)-1);
                    st[index] = x.substring(0, x.length() - 1);
                }
         System.out.println(String.join(" ", st));
            }
        }