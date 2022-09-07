package Collection;

import org.junit.Test;

import java.util.*;

public class day2CollectionTest {
    /**
     * 集合api方法
     */
    Collection co = new ArrayList();
    List list =new ArrayList();
    Collection co1 = new ArrayList();
    Map m = new HashMap();

    @Test
    public void addAll() {
        co.size();//获取有几个元素
    }

    @Test
    public void clear() {
        co.clear();//清空对象中数据
    }

    @Test
    public void isEmpty() {
        co.isEmpty();//判断集合中是否有元素存在
    }

    @Test
    public void contains() {
        co.add("2");
        Boolean n = co.contains(new String("2"));//判断co中是否存在co1，判断的是内容
        System.out.println(n);
    }

    @Test
    public void containsAll() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        Boolean n = co.containsAll(co1);//判断一个集合中数是否全部存在于另一个集合中
        System.out.println(n);
    }

    @Test
    public void remove() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        Boolean n = co1.remove(23);//移除一个存在的元素Boolean
        System.out.println(n);
    }

    @Test
    public void removeAll() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        Boolean n = co1.removeAll(co);//移除一个集合中另外一个集合的元素
        System.out.println(n);
        System.out.println(co1);
    }

    @Test
    public void retainAll() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        co.retainAll(co1);//查找两个集合中的相同元素，删除调用对象中不相同的数据
        System.out.println(co.retainAll(co1));
        System.out.println(co);
        System.out.println(co1);
    }

    @Test
    public void equals() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        Boolean n = co.equals(co1);//判断两个集合是否想同，通过有序对比其中数据
        System.out.println(n);
    }

    @Test
    public void hashCodde() {
        co.add(2);
        co.add(1);
        co.add(3);
        co1.add(1);
        co1.add(3);
        co1.add(4);
        ;//查找hashcode
        System.out.println(co.hashCode());
        System.out.println(m.hashCode());
    }

    @Test
    public void toArray() {
        co.add(2);
        co.add(new Object());
        co.add(new String("2"));
        co1.add(1);
        co1.add(3);
        co1.add(4);
        ;//集合转换成数组
        Object[] arr = co.toArray();
        Object[] arr1 = co1.toArray();
//        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void arrayList() {
        co.add(2);
        co.add(new Object());
        co.add(new String("2"));
        co1.add(1);
        co1.add(3);
        co1.add(4);
        ;//数组转成集合
        Object[] arr = co.toArray();
        Object[] arr1 = co1.toArray();
        List list = Arrays.asList(arr);
//        list.add(111);
        System.out.println(list);
    }

    @Test//迭代器遍历
    public void iterator() {
        co.add(2);
        co.add(new Object());
        co.add(new String("2"));
        co1.add(1);
        co1.add(3);
        co1.add(4);
        ;//遍历集合元素
        Iterator iterator = co.iterator();
        while (iterator.hasNext())
        {
            System.out.println( iterator.next());
        }
//        list.add(111);

    }
    @Test
    public void forEach(){
        int[] arr= new int[]{1,23,2,23,2};//增强for循环遍历数组和集合
        for(Integer a : arr){
            System.out.println(a);
        }
    }
}
