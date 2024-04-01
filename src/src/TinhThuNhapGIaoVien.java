import java.util.*;
public class TinhThuNhapGIaoVien{
    static int sup(String s){
        if("HT".compareTo(s) == 0) return 2000000;
        if("HP".compareTo(s) == 0) return 900000;
        return 500000;
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        String code = sc.nextLine();
        String name = sc.nextLine();
        int salary = sc.nextInt();
        int rank = Integer.parseInt(code.substring(2));
        int bonus = sup(code.substring(0,2));
        System.out.println(code + " " + name+ " " +rank+ " " +bonus+ " " + (salary + rank + bonus));
    }
}
/*
HP04
Tran Quoc Huy
1578000
 */