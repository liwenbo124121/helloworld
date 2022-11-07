package com.baidu.bugbye.bca.rule;

import com.baidu.bugbye.bca.supporter.CloseCloseableSupporter;
import org.apache.commons.io.IOUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.zip.GZIPOutputStream;

public class CloseCloseable {

    /*public void good1() throws IOException {
        InputStream ins = new FileInputStream("/file/path/g1.txt");
        ins.close();
    }

    public void good2() throws IOException {
        InputStream ins = new FileInputStream("/file/path/g2.txt");
        FileOutputStream os = new FileOutputStream("/file/path/g2.txt");
        os.flush();
        os.close();
        close(ins);
    }

    public void good3() throws IOException {
        InputStream ins = new FileInputStream("/file/path/g3.txt");
        CloseCloseableSupporter.close(ins);
    }

    public void good4() throws IOException {
        InputStream ins = new FileInputStream("/file/path/g3.txt");
        InputStreamReader isr = new InputStreamReader(ins);
        CloseCloseableSupporter.close(isr);
    }

    public void good5() throws IOException {
        InputStream ins = new FileInputStream("/file/path/g3.txt");
        InputStreamReader isr = new InputStreamReader(ins);
        IOUtils.closeQuietly(isr);
    }

    public void good6() throws IOException {
        try (InputStream ins = new FileInputStream("/file/path/g3.txt")) {
            ins.toString();
        }
    }

    public void good7() throws IOException {
        OutputStream os = new FileOutputStream("");
        os = new GZIPOutputStream(os);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.close();
    }

    public void good8() throws IOException {
        StringWriter sw = new StringWriter();
        sw.close();
    }

    public void good9() {
        StringWriter sw = new StringWriter();
        sw.toString();
    }

    public void bad1() throws Exception {
        InputStream ins = new FileInputStream("/file/path/b1.txt");
        ins.read();
    }

    private void close(InputStream inputStream) throws IOException {
        inputStream.close();
    }


    public int good13() {
        InputStream ins = null;

        try {
            ins = new FileInputStream("/file/path/b1.txt");
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ins.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }


    public void bad2() throws IOException {
        OutputStream os = new FileOutputStream("");
        os = new GZIPOutputStream(os);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        if (bw == null) {
            System.out.println("=====");
        }
        bw.close();
    }

    private InputStream ins;

    public int good12(int a) throws Exception {
        InputStream ins = null;
        try {
            if (a > 0) {
                ins = new FileInputStream("/file/path/b1.txt");
                ins.read();
            } else {
                ins = this.ins;
            }
            return 0;
        } finally {
            if (ins != null) {
                ins.close();
            }

        }
    }


    private FileInputStream buffer;

    public void good10(File file) throws IOException {
        FileInputStream os = this.buffer;
        os.read();
        if (os == null) {
            os = this.buffer;
        }
        os.close();
    }

    public void good11(File file) throws IOException {
        FileInputStream os = this.buffer;
        if (os == null) {
            os = this.buffer;
        }
        close(os);
    }

    public void bad10(File file) throws IOException {
        FileInputStream os = this.buffer;
        os.read();
        if (os == null) {
            os = this.buffer;
        }
    }

    public void bad11(File file) throws IOException {
        FileInputStream os = this.buffer;
        if (os == null) {
            os = this.buffer;
        }
    }*/


}
