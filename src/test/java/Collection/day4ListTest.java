package Collection;

import org.junit.Test;

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
    public void Vector() {//1010
        System.out.println(10 >> 2);
        System.out.println(1 << 2);
    }


}
