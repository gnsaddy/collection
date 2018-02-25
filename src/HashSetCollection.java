import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by gnsad on 12/10/2017.
 */
public class HashSetCollection {
    public static void main(String[] args){
        HashSet s= new HashSet();
        s.add("abc");  //96354
        s.add("qwe");    //112383
        s.add("xyz");      //119193
       s.add("rty");        //113271
        System.out.println("data is as "+ s +"  " + s.hashCode());
        Iterator i = s.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        for(Object k : s) {
                System.out.println(k);


        }

    }
}
