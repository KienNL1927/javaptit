import java.util.*;
public class TongUocSoTru1 {
    static long[] f = new long[2000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2000001; i++) {
            f[i] = 0;
            Boolean oke = true;
            for (int j = 2; j <= (int) i * i; j++) {
                if (i % j == 0) {
                    f[i] = f[j] + f[i / j];
                    oke = false;
                    break;
                }
            }
            if (oke) f[i] = i;
        }
        long t = sc.nextLong();
        long s = 0;
        for (long i = 0; i < t; i++) {
            int a = sc.nextInt();
            s += f[a];
        }
        System.out.println("s");
        sc.close();
    }
}