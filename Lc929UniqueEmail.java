import java.util.HashSet;

public class Lc929UniqueEmail {
    public static void main(String[] args) {
        String[] ip={"testemail+david@lee.tcode.com","test.e.mail+bob.cathy@leetcode.com","test.email+alex@leetcode.com"};
        System.out.println(UniqueMail(ip));
    }
    public static int UniqueMail(String[] arr){
        HashSet<String> set=new HashSet<>();
        String ss="";
        for(String i:arr) {
//            split
            int atPos = i.indexOf("@");
            String domain = i.substring(atPos);
            String local=i.substring(0,atPos);
//       remove dot
            local=local.replaceAll("\\.","");
            if(local.contains("+")){
                int plusPos=local.indexOf('+');
                local=local.substring(0,plusPos);
            }
            set.add(local+domain);
        }
        return set.size();
    }
}
