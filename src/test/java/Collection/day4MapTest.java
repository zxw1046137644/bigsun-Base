package Collection;

import org.junit.Test;

import java.util.*;

public class day4MapTest {
    /**
     * Map
     * ---HashMap主要实现类，效率高，线程不安全,可以存储 key：null value ：null,如果存储自定义类，那么要重写类中equals和HashCode方法
     * --LinkedHashMap:可以按照添加的顺序实现遍历操作
     * 底层结构上添加了一对指针，指向前一个和后一个
     * TreeMap：按照添加的key,value进行排序，底层是红黑树
     * Hashtable 线程安全，效率低
     * --Properties
     * CurrentHashMap
     * <p>
     * jdk 1.7 及之前 数组+链表
     * 底层实现：实例化以后长度创建16的数组，Entry[] table
     * map.put(key,value)
     * 调用key所在类的hashcode方法，获取存储位置，
     * 如果 存储位置上不存在数据则keyvalue存入成功
     * 如果 存储位置存在数据
     * 如果key的HashCode与已存在的数据的HashCode值都不一样，则以链表的形式存储
     * 如果key的HashCode与已存在的数据的HashCode值一样，则调用equals方法
     * 如果返回false则添加key-value成功
     * 如果返回true则替换相同HashCode的value数据
     * 扩容机制：扩容为原来容量的2倍，将原来的数据复制过来 超過臨街值開始扩容
     * jdk 1.8 数组+链表+红黑树 为了提升效率
     * 底层实现
     * 实例化不会创建数组
     * 在map.put(key,value)的时候才创建数组16 Node类型
     * 什么情况使用红黑树存储数据？
     * 当某个索引上的链表元素超过8个同时数组又大于64，则会改用红黑树方式存储数据
     */

    /**
     * 常用方法
     * put:增加元素
     * clear：清除map中数据
     * isEmpty：判断map是否为空
     * size：查看map中数据长度
     * clone：
     * containsKey：查看map是否有该key
     * containsValue：查看map中是否有该value
     * entrySet:取所有key-Value Set类型，就可以Collection遍历了
     * get:用key获取值:
     * putAll:
     * keySet:获取所有key Set类型，就可以Collection遍历了
     * remove:
     * Values:
     * equals:判断当前map和传入的数据是否相同 所有都相同
     */
    Map<String, Object> hashMap = new HashMap<String, Object>();
    Map linkedHashMap = new LinkedHashMap();
    Map treeMap = new TreeMap();
    Map hashtable = new Hashtable();


    @Test
    public void put() {

    }

    @Test//迭代器循环遍历
    public void itMap() {
        hashMap.put("1", 1);
        //普通
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(hashMap.get(key));
        }
        //entrySet最快
        Iterator<Map.Entry<String, Object>> iterator1 = hashMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Object> entry = iterator1.next();
            System.out.println(entry.getKey());
        }

    }

    @Test//增强for
    public void poorMap() {
        hashMap.put("1", 1);
        //普通
        for (Object key : hashMap.keySet()) {
            System.out.println("key" + key + "value" + hashMap.get(key));
        }
        //entrySet
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


}
