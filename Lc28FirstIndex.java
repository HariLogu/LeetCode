public class Lc28FirstIndex {
    public static void main(String[] args) {
        String h="wesadbusad";
        String n="sad";
        System.out.println(FirstIndex(h,n));
    }
    public static int FirstIndex(String hay,String needle){
//        return hay.indexOf(needle); we can use this line
//        only but we have to write our own algo
        for (int i = 0; i <hay.length() ; i++) {
            if(hay.charAt(i)==needle.charAt(0)){
//                here try to compare the first letter of n
//                with the elem in the h str
                int j=0;//first letter in  n
                int k=i;//first occurence in h
                while(j<needle.length() && k<hay.length() && needle.charAt(j)==hay.charAt(k)){
                    j++;
                    k++;
//                    then we have to find the end of the substr(must be n length)
                    if(j==needle.length()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
