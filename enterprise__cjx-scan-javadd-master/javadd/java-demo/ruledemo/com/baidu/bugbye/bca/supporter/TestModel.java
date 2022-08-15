package com.baidu.bugbye.bca.supporter;

import java.io.OutputStream;
import java.util.HashMap;

public class TestModel {
    public int anInt;
    public String string;
    public OutputStream outputStream;
    public boolean aBoolean;
    public HashMap<String, String> hm;


    public TestModel() {
    }

    public TestModel(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
