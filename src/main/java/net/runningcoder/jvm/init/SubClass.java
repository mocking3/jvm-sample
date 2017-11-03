package net.runningcoder.jvm.init;

/**
 * Created by wangmaocheng on 2017/6/14.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass静态块执行...");
    }

    public SubClass() {
        System.out.println("SubClass构造方法执行...");
    }
}
