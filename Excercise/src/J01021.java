import java.util.Scanner;

public class J01021 {
    static Long du = 1000000007L;
    public static long pow(long a, long b){
        if(b == 0)
            return 1L;
        long ans = pow(a, b/2);
        ans = (ans * ans) % du;
        if(b % 2 == 0)
            return ans;
        else
            return (ans * a) % du;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = 0;
        while(z <= 20){
            long a = sc.nextLong();
            long b = sc.nextInt();
            if(a==0 && b == 0){
                break;
            }
            System.out.println(pow(a, b));
            z++;
        }
    }
}
