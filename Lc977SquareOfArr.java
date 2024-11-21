import java.util.Arrays;


public class Lc977SquareOfArr {
    public static void main(String[] args) {
        int[] ar={-4,3,0};
        System.out.println(SquareSorted(ar));
    }
    public static int[] SquareSorted(int[] arr){
        int[] r=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=arr[i];
        }
        Arrays.sort(arr);
        return arr;

    }
}
