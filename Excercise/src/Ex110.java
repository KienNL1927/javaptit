import java.util.Scanner;

public class Ex110 {
    public static int average(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
    public static double average(double[] array){
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(array.length);
        return sum / array.length;

    }
}

