package zzz.reflex;

import org.junit.Test;
import zzz.collection.Emplay;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射
 */
public class reflexTest {




    /**
     * 创建反射对象的方式
     */
    @Test
    public void getReflex() throws Exception {
        Emplay emplay = new Emplay();
        //1
        Class emplay2 = emplay.getClass();
        //2
        ClassLoader aClass = Emplay.class.getClassLoader();
        Class<?> emplay4 = aClass.loadClass("zzz.collection.Emplay");
        //3使用类加载器
        Class emplay1 = Emplay.class;

        Class emplay3 = Class.forName("zzz.collection.Emplay");


        System.out.println(emplay2 == emplay1);
        System.out.println(emplay1 == emplay3);
        System.out.println(emplay4 == emplay3);

        //调用私有构造器
        Constructor dec = emplay1.getDeclaredConstructor(Integer.class);
        dec.setAccessible(true);
        Emplay o = (Emplay) dec.newInstance(34);
        o.setName("zxw");
        System.out.println(o.toString());


        //调用私有属性
        Field[] declaredFields = emplay1.getDeclaredFields();
        Field decAge = emplay1.getDeclaredField("age");
        decAge.setAccessible(true);
        decAge.set(o,22);
        System.out.println(o.toString());
        System.out.println(Arrays.toString(declaredFields));


        //调用私有方法
        Method[] declaredMethods = emplay1.getDeclaredMethods();
        Method decShow = emplay1.getDeclaredMethod("show");
        decShow.setAccessible(true);
        decShow.invoke(o);
//        System.out.println(Arrays.toString(declaredMethods));

    }

}
