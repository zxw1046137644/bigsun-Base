import org.junit.Test;

import java.util.*;

public class day4ListTest {
    /**
     * List中实现类的差异
     * ArrayList、LinkedList、Vector
     */
    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
    Vector vector =new Vector();
    @Test
    public void arrayList() {
        arrayList.add(null);
    }

    @Test
    public void arrayListCompare() {
        Comparator com = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        TreeMap arrayList = new TreeMap(com);
    }


    @Test
    public void LinkedList() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(14);
        for (Object list:arrayList)
        {
            System.out.println(list);
        }
    }

    @Test
    public void Vector() {//1010
        System.out.println(10 >> 2);
        System.out.println(1 << 2);
    }


}
