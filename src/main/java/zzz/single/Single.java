package zzz.single;

/**
 * 单例线程安全模式
 */
public class Single {

    public static Single single = null;

    public static synchronized Single getSingle() {
        if (single == null) {
            return single = new Single();
        }
        return single;
    }
}
