import java.util.HashMap;
import java.util.HashSet;
public class Basics {
    public static void main(String args[]){
        HashSet<Integer> sets = new HashSet<>();

        sets.add(100);
        sets.add(20);
        sets.add(50);
        sets.add(80);

        System.out.println(sets);

        System.out.println(sets.contains(50));
        System.out.println(sets.contains(70));

        sets.remove(50);

        System.out.println(sets);
 0
    }
}
