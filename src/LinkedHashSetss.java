/**
 * Created by gnsad on 12/16/2017.
 */
import java.util.*;
public class LinkedHashSetss {

    public static void main(String[] args){
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        System.out.println(linkedHashSet.size());
        linkedHashSet.add("abc");
        linkedHashSet.add("que");
        linkedHashSet.add("xyz");
        linkedHashSet.add("rty");
        linkedHashSet.add("a");
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet);
        for (Object o:linkedHashSet) {
            System.out.println(o);
        }
        System.out.println("---------------------");
        HashSet hs = new HashSet(linkedHashSet);
        for (Object obj : hs) {
            System.out.println(obj);

        }
    }
}
