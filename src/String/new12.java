package String;

public class new12 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
//        char cd="l";
                int pipe=0;
                int asterisk=0;
//                boolean cf=s.contains(cd);
        System.out.println(s.contains("de"));
                for(char ch : s.toCharArray()){
                    if(ch=='|'){
                        pipe++;
                    }
                    if(pipe%2==0){
                        if(ch=='*')
                            asterisk++;
                    }
                }
        System.out.println(asterisk);
            }
}