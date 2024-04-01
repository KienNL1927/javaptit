import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    static double tong(double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s %s %.1f", sc.nextLine(), sc.nextLine(), tong(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
 */
