import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex19 {
    int[] ss = new int[205];
    int[] cc = new int[101];
    public Ex19() {
        System.out.println("Generate 200 random number: ");
        Random a = new Random();
        for (int i = 0; i < 200; i++) {
            ss[i] = a.nextInt(10);
            System.out.print(ss[i] + " ");
            cc[ss[i]]++;
        }
        System.out.println();
    }
    public void display(){
        Arrays.sort(ss);
        for (int i = 0; i < 200; i++) {
            if(cc[ss[i]] > 0){
                System.out.println("The count for " + ss[i] + " is: " + cc[ss[i]]);
                cc[ss[i]] = 0;
            }
        }
    }
}
