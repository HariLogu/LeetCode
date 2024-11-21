public class Lc1672RichestCus {
    public static void main(String[] args) {
        int[][] acc={{2,8,7},{7,1,3},{5,5,5}};
        System.out.println(Richest(acc));
    }
    public static int Richest(int[][] arr){
        int max=0;
        for(int[] i:arr){
            int rowSum=0;
            for(int j:i){
                rowSum+=j;
            }
            if(rowSum>max){
                max=rowSum;
            }
        }
        return max;
    }
}
