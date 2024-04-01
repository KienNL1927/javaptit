import java.util.Scanner;
import java.lang.String;
public class Ex13 {
    int[] ss = new int[1000];
    String a;
    public Ex13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array: ");
        a = sc.nextLine();
    }
    public void createArray(){
        ss = new int[1000];
        for(int i = 0; i < a.length(); i++)
            ss[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
    }
    public void displayArray() {
        for (int i = 0; i < a.length(); i++)
            System.out.print(ss[i] + " ");
        System.out.println();
    }
    public int[] reverseArray(){
        int bb[] = new int[1000];
        for(int i = 0; i < a.length(); i++)
            bb[i] = ss[i];
        for(int i = 0; i < a.length(); i++)
            ss[i] = bb[a.length() - i -1];
        return ss;
    }
    public void displayReverse(){
        createArray();
        System.out.println("Display Array");
        displayArray();
        reverseArray();
        System.out.println("Reverse Array: ");
        for(int i = 0; i < a.length(); i++)
            System.out.print(ss[i]);

    }
}
