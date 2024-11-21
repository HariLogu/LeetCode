public class LC53largestSubArr {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(largestSubarray(arr));
    }

    private static int largestSubarray(int[] arr) {
        int curr=0;
        int maxEle=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int res=curr+arr[i];
            if(res<arr[i]){
                curr=arr[i];
            }
             else {
                curr = res;
            }
            if(maxEle<curr){
                maxEle=curr;
            }
        }
        return maxEle;
    }
}
