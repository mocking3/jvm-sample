package net.runningcoder.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by wangmaocheng on 2017/6/7.
 */
public class TestTimer {
    public static void main(String[] args) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + " run...");
                timer.cancel();
            }
        }, 1000);

    }
}
