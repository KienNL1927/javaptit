import java.util.Scanner;

public class PhanSO {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS ps = new PS(sc.nextLong(), sc.nextLong());
        System.out.println(ps.getTu() + "/" + ps.getMau());
    }
}
