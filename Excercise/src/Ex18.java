import java.util.Arrays;
import java.util.Scanner;
public class Ex18 {
    int n;
    boolean[] sieve;

    public Ex18() {
        sieve = new boolean[1000 + 1];
        Arrays.fill(sieve, false);
        for (int i = 2; i * i <= 1000; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }

    public void display() {
        for (int i = 2; i <= 50; i++) {
            if (!sieve[i]) {
                System.out.print(i + " ");
            }
        }
    }
}