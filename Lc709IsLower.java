import java.util.Arrays;

public class Lc709IsLower {
    public static void main(String[] args) {
        System.out.println(ToLower("HeLLO wOrLD"));
    }
    public static String ToLower(String s){
        String r="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int ascii=(int)ch[i];
            if(ascii>64 && ascii<91){
                ch[i]=(char)(ascii+32);
            }
        }
        return String.valueOf(ch);
    }
}
