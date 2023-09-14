package Collection;

import org.junit.Test;
import zzz.Collection.Emplay;

import java.util.*;

public class day4SetTest {

    /**
     * HashSet
     * LinkedHashSet 按照插入顺序输出
     * TreeSet
     */
    HashSet hashSet = new HashSet();
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    TreeSet treeSet = new TreeSet();



    Integer a;
    @Test
    public void test(){
        hashSet.add(null);
        System.out.println(hashSet);
    }

    @Test
    public void hashTest(){
        hashSet.add(1);
        hashSet.add(222);
        hashSet.add(11);
        hashSet.add(33);
        System.out.println(hashSet);
    }

    @Test
    public void linkHashTest(){
        linkedHashSet.add(1);
        linkedHashSet.add(222);
        linkedHashSet.add(11);
        linkedHashSet.add(33);
        System.out.println(linkedHashSet);
    }

    /**
     * 实现 对象中 comparable 接口
     */
    @Test
    public void treeTest1() {
        Emplay a1 = new Emplay();
        Emplay a2 = new Emplay();
        a1.setAge(1);
        a1.setName("z");
        a2.setAge(2);
        a2.setName("zxw");

        treeSet.add(a1);
        treeSet.add(a2);

//        treeSet.add(2);
        System.out.println(treeSet);
//        Iterator iterator = treeSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(   iterator.next());
//
//        }
        for(Object o : treeSet){
            System.out.println(o);
        }
    }

    /**
     * 实现 对象中 comparator 接口 定制排序
     */
    @Test
    public void treeTest21() {
        Comparator com = new Comparator<Emplay>() {
            @Override
            public int compare(Emplay o1, Emplay o2) {
                return -o1.getAge().compareTo(o2.getAge());
            }
        };
        Emplay a1 = new Emplay();
        Emplay a2 = new Emplay();
        a1.setAge(1);
        a1.setName("z");
        a2.setAge(2);
        a2.setName("zxw");
        TreeSet treeSet1 = new TreeSet(com);
        treeSet1.add(a1);
        treeSet1.add(a2);
        System.out.println(treeSet1);

        for(Object o : treeSet1){
            System.out.println(o);
        }
    }
}
