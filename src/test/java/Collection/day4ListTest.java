package Collection;

import org.junit.Test;
import zzz.collection.Emplay;

import java.util.*;

public class day4ListTest {
    /**
     * List中实现类的差异
     * ArrayList、LinkedList、Vector
     */


    /**
     * 可以加入NULL ArrayList：执行效率高，线程不安全的，所以效率高，底层使用数组存储
     */
    List<Integer> arrayList = new ArrayList();

    List linkedList = new LinkedList();

    /**
     * 线程安全
     */
    List vector =new Vector();



    @Test
    public void arrayList() {
        arrayList.add(null);
        System.out.println(arrayList);
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


    //增强for循环遍历List
    @Test
    public void LinkedList() {
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(14);

        //增强for循环遍历List
        for (Integer list:arrayList)
        {
            System.out.println(list);
        }


        //迭代器方式遍历list
        Iterator iteratorArr = arrayList.iterator();
        while ( iteratorArr.hasNext())
        {
            System.out.println( iteratorArr.next());
        }


    }

    //List排序
    @Test
    public void ListSort(){

    }

    @Test
    public void EqualTest() {//1010
        List<Emplay> b1 = new ArrayList();
        List<Emplay> b2 = new ArrayList();
        Emplay a1 = new Emplay();
        Emplay a2 = new Emplay();
        a1.setAge(1);
        a1.setName("z");
        a2.setAge(1);
        a2.setName("z");
        System.out.println(a1.equals(a2));
        b1.add(a1);
        b2.add(a2);
        System.out.println(b1.equals(b2));
        //list转化数组
        Object[] objects = b2.toArray();

        System.out.println(Arrays.toString(objects));

    }


    @Test
    public void Vector() {//1010
        System.out.println(10 >> 2);
        System.out.println(1 << 2);
    }


}
