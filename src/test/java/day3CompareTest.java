import org.junit.Test;
import zzz.collection.Emplay;
import zzz.lock.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class day3CompareTest {

    /**
     * 集合排序
     * Comparable,Comparator()
     */

    @Test
    public void ComparableTest() {
        Object[] array = new Object[5];
        array[0] = new Emplay("zxw", 25);
        array[1] = new Emplay("zxw1", 15);
        array[2] = new Emplay("zxw2", 23);
        array[3] = new Emplay("zxw3", 55);
        array[4] = new Emplay("zxw4", 55);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void ComparatorTest() {
        Object[] array = new Object[5];

        array[0] = new Emplay("zxw", 25);
        array[1] = new Emplay("zxw1", 15);
        array[2] = new Emplay("zxw2", 23);
        array[3] = new Emplay("zxw3", 55);
        array[4] = new Emplay("zxw4", 55);
        Arrays.sort(array, new Comparator() {
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Emplay && o2 instanceof Emplay) {
                    Emplay s1 = (Emplay) o1;
                    Emplay s2 = (Emplay) o2;
                    return s1.getAge().compareTo(s2.getAge());
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(array));

    }
}
