import java.util.*;

import static java.lang.Math.round;

public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine(), name = sc.nextLine();
        Double toan = sc.nextDouble(), ly = sc.nextDouble(), hoa = sc.nextDouble();
        double bonus = 0;
        if(id.substring(0,3).compareTo("KV1") == 0)
            bonus = 0.5;
        else if(id.substring(0,3).compareTo("KV2") == 0)
            bonus = 1.0;
        else
            bonus = 2.5;
        double all = toan*2+ly+hoa+bonus;
        String mm = "TRUOT";
        if(all >= 24)
            mm = "TRUNG TUYEN";
        System.out.printf("%s %s ",id, name);
        //System.out.printf("%.1f %.1f ",bonus, toan*2+ly+hoa);
        if(round(bonus) == bonus)
            System.out.print((int)bonus + " ");
        else
            System.out.printf("%.1f ", bonus);
        if(round(toan*2+ly+hoa) == toan*2+ly+hoa)
            System.out.print((int)(toan*2+ly+hoa) + " ");
        else
            System.out.printf("%.1f ", toan*2+ly+hoa);
        System.out.println(mm);
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
5

KV2B123
Ly Thi Thu Ha
8
6.5
7
 */