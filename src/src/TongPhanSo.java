import java.util.Scanner;

public class TongPhanSo {
    static long gcd(long a, long b){
        if(b == 0 ) return a;
        return gcd(b, a%b);
    }
    static class PS{
        private long tu, mau;
        PS(){
            this.tu = 1;
            this.mau = 1;
        }
        public PS(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        public void setTu(long tu){
            this.tu = tu;
        }
        public void setMau(long Mau){
            this.mau = mau;
        }
        public long ggg(){
            return gcd(this.tu , this.mau);
        }
        public long getTu(){

            return this.tu / ggg();
        }
        public long getMau(){
            return this.mau / ggg();
        }
    }
    static PS tong(PS a, PS b){
        long mauchung = a.mau * b.mau;
        long tu = a.tu * b.mau + b.tu*a.mau;
        PS dd = new PS(tu / gcd(tu,mauchung), mauchung / gcd(tu,mauchung));
        return dd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS A = new PS(sc.nextLong(), sc.nextLong());
        PS B = new PS(sc.nextLong(), sc.nextLong());
        System.out.println(tong(A,B).tu + "/" + tong(A,B).mau);
    }
}
