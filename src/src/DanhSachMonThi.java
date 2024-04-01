import java.util.*;
import java.io.*;
import java.io.File;

public class DanhSachMonThi {
    static class sub{
        String code, name, method;
        public sub(String code, String name, String method){
            this.code = code;
            this.name = name;
            this.method = method;
        }
        public boolean big(sub b){
            if(code.compareTo(b.code) > 0)
                return true;
            return false;
        }
        @Override
        public String toString(){
            return this.code + " " + this.name + " " + this.method;
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sub[] a = new sub[n+5];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            a[i] = new sub(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sub tmp;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i].big(a[j])){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
