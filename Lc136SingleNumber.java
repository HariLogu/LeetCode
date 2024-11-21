public class Lc136SingleNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,4};
        System.out.println(SingleNum(arr));
    }
    public static int SingleNum(int[] arr){
        int r=0;
        for(int i:arr){
            r^=i;
        }
        return r;
    }
}
