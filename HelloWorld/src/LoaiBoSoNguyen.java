import java.util.*;
import java.io.File;
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arrayList = new ArrayList<>();
        long tong = 0;
        while(sc.hasNext()){
            String tmp = sc.next();
            try{
                int x = Integer.parseInt(tmp);
                tong += x;
            } catch (Exception e){
                arrayList.add(tmp);
            }
        }
        Collections.sort(arrayList);
        for(String tmp: arrayList)
            System.out.println(tmp + " ");
    }
}
