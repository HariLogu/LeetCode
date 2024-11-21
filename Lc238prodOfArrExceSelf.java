import java.util.Arrays;

public class Lc238prodOfArrExceSelf {
    public static int[] fun(int[] arr){
        int pre=1;
        int post=1;
        int[] res=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i]=1;
        }
//        prefix operation
        for (int i = 0; i < arr.length; i++) {
            res[i]=pre*res[i];
            pre=pre*arr[i];
        }

//        postfix operation
        for (int i = arr.length-1; i >= 0; i--) {
            res[i]*=post;
            post*=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(fun(arr)));
    }
}
