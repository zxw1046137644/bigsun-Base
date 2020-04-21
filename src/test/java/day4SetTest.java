import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class day4SetTest {

    /**
     * set
     */
    HashSet hashSet = new HashSet();
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    TreeSet treeSet = new TreeSet();

    @Test
    public void treeTest1() {
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(2);
        System.out.println(treeSet);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(   iterator.next());

        }
        for(Object o : treeSet){
            System.out.println(o);
        }
    }
}
