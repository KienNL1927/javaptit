import java.util.Scanner;

public class KhaiBaoHCN {
    static class Rectange{
        private double w, h;
        private String color;
        Rectange(){
            this.w = 1;
            this.h = 1;
        }
        public Rectange(double w, double h, String color){
            this.w = w;
            this.h = h;
            this.color = color;
        }
        public double getW(){
            return w;
        }
        public double getH(){
            return h;
        }
        public void setW(double w){
            this.w = w;
        }
        public void setH(double h){
            this.h = h;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public double findArea(){
            return (this.w * this.h);
        }
        public double findPerimeter(){
            return (this.w + this.h) * 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange R = new Rectange();
        double x = sc.nextDouble();
        R.setW(x);
        x = sc.nextDouble();
        R.setH(x);
        String s = sc.next();
        s = s.toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        R.setColor((s));
        if(R.getW() > 0 && R.getH() > 0)
            System.out.printf("%.0f %.0f %s", R.findPerimeter(), R.findArea(), R.getColor());
        else
            System.out.println("INVALID");
    }
}
