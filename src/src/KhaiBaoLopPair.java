import java.util.*;
import java.io.*;

public class KhaiBaoLopPair{
    static boolean Prime(int a){
        if ( a == 2)
            return true;
        if( a <= 2)
            return false;
        if(a % 2 == 0)
            return false;
        for(int i = 3; i <= (int)Math.sqrt(a); i+=2)
            if(a % i == 0)
                return false;
        return true;
    }
    static class Pair <K, V>{
        public int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public boolean isPrime(){
            return Prime(x) && Prime(y);
        }
        @Override
        public String toString(){
            return String.format("%d %d", x, y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                System.out.println(p);
                check = true;
                break;
            }
        }
            if(!check) System.out.println(-1);
            }
        }
    }