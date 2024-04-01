import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Ex16 {
    int[] ss = new int[1000];
    int n;
    public Ex16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of number: ");
        n = sc.nextInt();
        System.out.println("Input " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextInt();
        }
    }
    public void Sort(){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(ss[i] > ss[j]){
                    int a = ss[i];
                    ss[i] = ss[j];
                    ss[j] = a;
                }
            }
        }
        System.out.println("After sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ss[i] + " ");
        }
    }
}
