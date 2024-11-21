import java.util.HashSet;

public class Lc771Jewels {
    public static void main(String[] args) {
        String s="ZZ";
        String j="zZ";
        System.out.println(JandS(j,s));
    }
    public static int JandS(String j,String s){
        HashSet<Character> set=new HashSet<>();
        int c=0;

        for(char i:j.toCharArray()){
            set.add(i);
        }
        for(char i:s.toCharArray()){
            if(set.contains(i)){
                c+=1;
            }
        }
        return c;
    }
}
