public class Lc1037ValidBoomeraang {
    public static void main(String[] args) {
        int[][] arr={{1,1},{2,2},{3,3}};
        System.out.println(fun34(arr));
    }

    private static boolean fun34(int[][] p) {
        int r1=(p[1][1]-p[0][1])*(p[2][0]-p[1][0]);
        int r2=(p[2][1]-p[1][1])*(p[1][0]-p[0][0]);
        return (r1!=r2);
    }
}
