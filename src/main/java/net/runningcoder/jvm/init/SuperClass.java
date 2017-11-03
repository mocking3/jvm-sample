package net.runningcoder.jvm.init;

/**
 * Created by wangmaocheng on 2017/6/14.
 */
public class SuperClass {

    public static int value = 1;

    static {
        System.out.println("SuperClass静态块执行...");
    }

    public SuperClass() {
        System.out.println("SuperClass构造方法执行...");
    }
}
