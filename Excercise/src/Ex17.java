import java.util.Scanner;

public class Ex17 {
    int[] ss = new int[15];
    public Ex17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            ss[i] = sc.nextInt();
        }
    }
    public void display(){
        int odd = 0, even = 0;
        for (int i = 0; i < 10; i++) {
            if(ss[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
