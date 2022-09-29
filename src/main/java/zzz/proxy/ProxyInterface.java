package zzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface ProxyInterface {
    void getName();
}

class Man implements ProxyInterface{

    @Override
    public void getName() {
        System.out.println("zxw");
    }
}

class ProxyTest {
    public static Object getInstance(Object obj){
        HanderProxy hander = new HanderProxy(obj);
//        hander.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),hander);
    }
}

class HanderProxy implements InvocationHandler {

    Object obj;

//    public void bind(Object obj){
//        this.obj = obj;
//    }
    //构造器方式获取代理类对象
    public HanderProxy(Object obj)
    {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法:"+method.getName());
        return method.invoke(obj,args);
    }


}

class main{
    public static void main(String[] args) {
        Man man = new Man();
        ProxyInterface instance = (ProxyInterface) ProxyTest.getInstance(man);
        instance.getName();
    }
}

