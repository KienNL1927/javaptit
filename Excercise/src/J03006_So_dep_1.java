import java.util.Scanner;

public class J03006_So_dep_1 {
        public static boolean Par(StringBuilder ss){
            StringBuilder s = new StringBuilder(ss.toString());
            s.reverse();
            return ss.toString().equals(s.toString());
        }
        public static boolean Even(StringBuilder ss){
            int sum = 0;
            String[] numbers = ss.toString().split(" ");
            for (String number : numbers) {
                sum += (Integer.valueOf(number));
            }
            if(sum % 10 == 0)
                return true;
            return false;
        }
        public static boolean check(StringBuilder ss){
            if(ss.charAt(0) != 8 || ss.charAt(ss.length() - 1) != 8)
                return false;
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); //sc.nextLine();
            for (int i = 0; i < t; i++) {
                StringBuilder ss = new StringBuilder(sc.next());
                if(Par(ss) && Even(ss) && check(ss))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }

