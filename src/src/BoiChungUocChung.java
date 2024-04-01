import java.util.*;
public class BoiChungUocChung {
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        return (a*b) / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a,b) + " " + gcd(a,b));
        }
    }
}
