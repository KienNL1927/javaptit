import java.util.*;
import java.io.File;
import java.util.Map;
public class So_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(!map.containsKey(x))
                map.put(x, 1);
            else
                map.put(x, map.get(x) + 1);
        }
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
