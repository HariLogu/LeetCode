import java.util.Arrays;

public class Lc58LenLastWord {
    public static void main(String[] args) {
        String s="   I   will    live  in joyboy  moon     ";
        System.out.println((Length(s)));
    }
    public static int Length(String s){
        String[] r=s.trim().split(" ");
        return r[r.length-1].length();
    }
}
