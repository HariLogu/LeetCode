import java.util.HashMap;
import java.util.Hashtable;

public class Lc217ContainsDup {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(ContainsDuplicate(arr));
    }
    public static boolean ContainsDuplicate(int[] arr){
        HashMap<Integer,Integer> table=new HashMap<>();
        for (int i:arr) {
            if(table.containsKey(i)){
                return true;
            }
            table.put(i,1);
        }
        return false;
    }
}
