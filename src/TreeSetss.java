import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by gnsad on 12/16/2017.
 */
public class TreeSetss {
    public static void main(String[] args){
        TreeSet ts= new TreeSet();

        ts.add(25);  ts.add(12);
        ts.add(35);
        ts.add(30);
        ts.add(22);
        for (Object o:ts) {
            System.out.println(o);

        }
        System.out.println("----------" +ts);
        ArrayList al= new ArrayList(ts);
        for (Object obj:al) {
            System.out.println(obj);

        }
    }
}
