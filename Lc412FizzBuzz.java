import java.util.ArrayList;
import java.util.List;

public class Lc412FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(30));
    }
    public static List<String> FizzBuzz(int n){
        List<String> ans=new ArrayList<>();
        for (int i = 1; i <n+1 ; i++) {
            boolean divBy3=i%3==0;
            boolean divBy5=i%5==0;
            if (divBy3 && divBy5) {
                ans.add("FizzBuzz");
            } else if (divBy3) {
                ans.add("Fizz");
            } else if (divBy5) {
                ans.add("Buzz");
            }
            else
                ans.add(Integer.toString(i));
        }
        return ans;
    }
}
