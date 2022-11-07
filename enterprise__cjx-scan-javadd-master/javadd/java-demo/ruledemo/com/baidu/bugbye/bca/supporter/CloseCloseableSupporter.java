package com.baidu.bugbye.bca.supporter;

import java.io.Closeable;
import java.io.IOException;

public class CloseCloseableSupporter {
    public static void close(Closeable closeable) throws IOException {
        closeable.close();
    }
}
