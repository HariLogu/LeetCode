import java.util.HashMap;

public class Lc1346Nand2nExists {
    public static void main(String[] args) {
        int[] arr={10,0,15,4};
        System.out.println(IsExists(arr));
    }
    public static boolean IsExists(int[] arr){
        HashMap<Integer,Integer> map=new HashMap();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(2*arr[i]) && i!=map.get(2*arr[i])){
                return true;
            }
        }
        return false;
    }
}
