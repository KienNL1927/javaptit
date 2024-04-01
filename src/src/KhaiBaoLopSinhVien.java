import java.util.*;
public class KhaiBaoLopSinhVien {
    static String conver(String d) {
        String[] s = d.split("/");
        for(int i = 0;i < s.length; i++){
            if(s[i].length() < 2)
                s[i] = "0" + s[i];
        }
        return s[0] + '/' + s[1] + '/' + s[2];
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("B20DCCN001 %s %s %s %s", sc.nextLine(), sc.nextLine(), conver(sc.next()), sc.next());
    }
}
/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
 */