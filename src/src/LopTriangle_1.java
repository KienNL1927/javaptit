import java.util.*;
public class LopTriangle_1 {
    static class Point{
        double x, y;

        public Point(double a, double b){
            x = a;
            y = b;
        }

        static Point nextPoint(Scanner sc){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            return a;
        }
    }

    static double dis(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }


    static class Triangle {
            double AB, AC, BC;

            public Triangle(Point a, Point b, Point c) {
                AB = dis(a, b);
                BC = dis(b, c);
                AC = dis(c, a);
            }

            public boolean valid() {
                if (AB + BC <= AC || AB + AC <= BC || AC + BC <= AB)
                    return false;
                return true;
            }

            public String getPerimeter() {
                double cv = AB + AC + BC;
                return String.format("%.3f", cv);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
                if (!a.valid()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(a.getPerimeter());
                }
            }
        }
    }


