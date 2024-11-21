import java.util.Arrays;

public class Lc242ValidAnagram {
    public static void main(String[] args) {
        System.out.println(Anagram("code","deco"));
    }
    public static boolean Anagram(String s1,String s2){
        char[] sor1=s1.toCharArray();
        char[] sor2=s2.toCharArray();
        Arrays.sort(sor1);
        Arrays.sort(sor2);
        return Arrays.equals(sor1,sor2);
    }
}
