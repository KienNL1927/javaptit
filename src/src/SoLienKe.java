import java.util.*;

import static java.lang.Integer.parseInt;

public class SoLienKe {
    static String slk(String s){
        for(int i = 0; i < s.length()-1; i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i+1));
            if(a-b != 1 && b-a!= 1)
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            String s = sc.next();
            System.out.println(slk(s));
        }
        sc.close();
    }
}
