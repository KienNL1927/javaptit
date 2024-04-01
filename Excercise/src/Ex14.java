import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Ex14 {
    int[] ss = new int[1000];
    String a;

    public Ex14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array: ");
        a = sc.nextLine();
    }

    public void createArray() {
        ss = new int[1000];
        for (int i = 0; i < a.length(); i++)
            ss[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
    }

    public void displayArray() {
        for (int i = 0; i < a.length(); i++)
            System.out.print(ss[i] + " ");
        System.out.println();
    }

    public int sumArray() {
        int sum = 0;
        for (int i = 0; i < a.length(); i++)
            sum += ss[i];
        return sum;
    }

    public int maxArray() {
        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            if (ss[i] > max)
                max = ss[i];
        }
        return max;
    }

    public int minArray() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length(); i++) {
            if (ss[i] < min)
                min = ss[i];
        }
        return min;
    }
}
