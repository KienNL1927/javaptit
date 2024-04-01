import java.util.Scanner;
import java.io.File;

public class docfilevanban {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            System.out.println(tmp);
        }
    }
}
