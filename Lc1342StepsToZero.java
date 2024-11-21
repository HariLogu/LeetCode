public class Lc1342StepsToZero {
    public static void main(String[] args) {
        System.out.println(Steps(14));
    }
    public static int Steps(int n){
        int c=0;
        while(n!=0 && n>0){
            if(n%2==0){
                n/=2;
            }
            else{
                n-=1;
            }
            c++;
        }
        return c;
    }
}
