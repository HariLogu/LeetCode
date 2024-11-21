public class Lc121MaxProfit {
    public static int maxProfit(int[] arr){
        int l=0;
        int r=1;
        int maxP=0;
        while(r<arr.length){
            if(arr[l]<arr[r]){
                int profit=arr[r]-arr[l];
                maxP=Math.max(profit,maxP);
            }
            else{
                l=r;
            }
            r+=1;
        }
        return maxP;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,4};
        System.out.println(maxProfit(arr));
    }
}
