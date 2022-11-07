package com.baidu.bugbye.bca.rule;

import java.io.Closeable;
import java.io.IOException;

public class CloneNotCloneable {

    class bad1 {
        public bad1 clone() {
            return new bad1();
        }
    }

    class good1 implements Cloneable {
        public good1 clone() {
            return new good1();
        }
    }

    class good2 implements Closeable, Cloneable {
        public good2 clone() {
            return new good2();
        }

        @Override
        public void close() throws IOException {

        }
    }
}
