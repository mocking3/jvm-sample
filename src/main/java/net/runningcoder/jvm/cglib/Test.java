package net.runningcoder.jvm.cglib;

/**
 * Created by wangmaocheng on 2017/6/1.
 */
public class Test {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Test test = (Test) proxy.getProxy(Test.class);
//        test.say();
        System.out.println(test);
    }

    public void say() {
        System.out.println("hello");
    }
}
