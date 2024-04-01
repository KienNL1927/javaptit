import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Ex15 {
    int[] ss = new int[1000];

    public Ex15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 50 numbers: ");
        for (int i = 0; i < 50; i++) {
            ss[i] = sc.nextInt();
        }
    }
    public double average(){
        double sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += (double)ss[i];
        }
        return sum / (double)50;
    }
    public int GreaterThanAverage(){
        int count = 0;
        for (int i = 0; i < 50; i++) {
            if(ss[i] > average())
                count++;
        }
        return count;
    }
    public void NumGreater(){
        System.out.println("Average of these numbers: " + average());
        System.out.println("Number of the items greater than the average" + GreaterThanAverage());
        System.out.println("Numbers greater the average:");
        for (int i = 0; i < 50; i++) {
            if(ss[i] > average())
                System.out.print(ss[i] + " ");;
        }
    }
}
