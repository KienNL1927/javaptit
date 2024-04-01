import java.util.Scanner;

public class J02004 {
    int t;
    int[] a = new int[100000 + 5];
    int n;
    private Scanner sc;

    public J02004(){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        n = sc.nextInt();

    }
    public void ss() {
        for (int j = 0; j < t; j++) {
            boolean check = true;
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n - 1 - i]) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

