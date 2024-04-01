import java.util.Scanner;

public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int salary = sc.nextInt(), day = sc.nextInt();
        sc.nextLine();
        String pos = sc.nextLine();
        int baseSalary = salary* day;
        int bonus = 0;
        if(day >= 25)
            bonus = baseSalary / 5;
        else if(day >= 22 && day < 25)
            bonus = baseSalary / 10;
        int support = 0;
        if(pos.equals("GD"))
            support = 250000 ;
        else if(pos.equals("PGD"))
            support = 200000 ;
        else if(pos.equals("TP"))
            support = 180000;
        else
            support = 150000;

        System.out.print("NV01 " + name + " " + baseSalary + " " + bonus + " " + support + " " + (baseSalary+support+bonus) );
    }
}
/*
Bui Thi Trang
45000
23
PGD
 */