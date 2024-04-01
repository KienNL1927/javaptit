import java.util.Scanner;

public class ChuViTamGiac {
    static class Point{
        double x, y;
        public Point(){
            this.x = 0;
            this.y = 0;
        }
        public void setX(double x){
            this.x = x;
        }
        public void setY(double Y){
            this.y = y;
        }
        public double getDist(Point A) {
            return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
        }
    }
    static class Triangle{
        private Point a = new Point();
        private Point b = new Point();
        private Point c = new Point();
        private double AB, AC, BC;
        public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
            a.setX(x1);
            a.setY(y1);
            b.setX(x2);
            b.setY(y2);
            c.setX(x3);
            c.setY(y3);
            this.AB = a.getDist(b);
            this.AC = a.getDist(c);
            this.BC = b.getDist(c);
        }
        @Override
        public String toString(){
            if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
                return String.format("INVALID");
            else return String.format("%.3f", AB + AC + BC );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            Triangle A = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            System.out.println(A);
        }
        /*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
         */
    }
}
