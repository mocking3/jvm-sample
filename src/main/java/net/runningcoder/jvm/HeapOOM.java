package net.runningcoder.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmaocheng on 2017/5/27.
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
