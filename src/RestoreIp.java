import java.util.ArrayList;
import java.util.List;

public class RestoreIp {
    List<String> ips = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
  restore(new ArrayList<>(), s, 0);
        return ips;
    }
    private void restore(List<String> ip, String str, int len){
        if(ip.size() == 4 && str.length() > 0){
            return;
        }
        if(ip.size() == 4 && str.isEmpty()){
            ips.addAll(ip);
            System.out.println(ips);
            return;
        }
      //  System.out.println(str);
        System.out.println(ip);
        for (int i = 0; i <  str.length(); i++) {

            ip.add(str.substring(i));
            restore(ip, str.substring(i), len+1);
            ip.remove(ip.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new RestoreIp().restoreIpAddresses("0000"));
    }
}
