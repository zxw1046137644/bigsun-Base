package Compare;

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
     * Comparable接口
     * Comparator接口 定制排序
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
        Emplay[] array = new Emplay[5];

        array[0] = new Emplay("zxw", 25);
        array[1] = new Emplay("zxw1", 15);
        array[2] = new Emplay("zxw2", 23);
        array[3] = new Emplay("zxw3", 55);
        array[4] = new Emplay("zxw4", 55);

        Arrays.sort(array, new Comparator<Emplay>() {
            @Override
            public int compare(Emplay o, Emplay t1) {
                if (o.getAge() > t1.getAge()) {
                    return 1;
                } else if ((o.getAge() < t1.getAge())) {
                    return -1;
                } else {
                    return -o.getName().compareTo(t1.getName());
                }
            }
        });

        System.out.println(Arrays.toString(array));

    }
}
