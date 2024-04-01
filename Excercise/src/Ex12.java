import java.util.Scanner;
import java.lang.String;
public class Ex12 {
    String a;
    char[] character;
    public Ex12(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
    }
    public void createArray(){
        character = new char[1000];
        for(int i = 0; i < a.length(); i++)
            character[i] = a.charAt(i);
    }
    public void displayArray(){
        for(int i = 0; i < a.length(); i++)
            System.out.print(character[i] + " ");
        System.out.println();
    }
    int[] count = new int[1000];

    public void countLetters(){
        for(char i : character)
            count[i]++;
    }
    public void displayCounts(){
        createArray();
        displayArray();
        countLetters();
        for(int i = 0; i < a.length(); i++)
            if(count[a.charAt(i)] > 0){
                System.out.println(a.charAt(i) + " : " + count[a.charAt(i)]);
                count[a.charAt(i)] = 0;
            }

    }
}
