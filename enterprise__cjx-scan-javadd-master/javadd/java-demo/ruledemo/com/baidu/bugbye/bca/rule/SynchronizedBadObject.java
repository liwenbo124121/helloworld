package com.baidu.bugbye.bca.rule;

import java.util.concurrent.atomic.AtomicBoolean;

public class SynchronizedBadObject {
    protected final AtomicBoolean started = new AtomicBoolean(false);

    public boolean bad1() {
        synchronized (started) {
            return true;
        }
    }
}
