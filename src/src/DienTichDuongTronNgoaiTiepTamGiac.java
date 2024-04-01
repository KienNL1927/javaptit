import java.util.*;
public class DienTichDuongTronNgoaiTiepTamGiac {
    static class Point{
        double x;
        double y;
        public Point(){
            this.x = 0;
            this.y = 0;
        }
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public void setX(double x){
            this.x = x;
        }
        public void setY(double y){
            this.y = y;
        }
        public double getDis(Point p){
            return Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y));
        }
    }
    static class Triangle{
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        private double AB, AC, BC;
        public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
            a.setX(x1);
            a.setY(y1);
            b.setX(x2);
            b.setY(y2);
            c.setX(x3);
            c.setY(y3);
            AB = a.getDis(b);
            AC = a.getDis(c);
            BC = b.getDis(c);
        }
        @Override
        public String toString(){
            if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
                return String.format("INVALID");
                double ss = (AB*AC*BC) / (Math.sqrt((AB+AC+BC)*(AB+AC-BC)*(-AB+AC+BC)*(AB-AC+BC)));
                return String.format("%.3f", ss*ss*Math.PI);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Triangle a = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble() );
            System.out.println(a);
        }
    }
    /*
    3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
     */
}
