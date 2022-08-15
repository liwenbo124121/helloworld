package com.baidu.bugbye.bca.rule;

import android.os.Environment;

public class SdCardMount {

    public void good1() {
        Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        Environment.getExternalStorageDirectory().toString();
        Environment.getExternalStoragePublicDirectory("");
    }

    public void good2() {
        if (check()) {
            Environment.getExternalStorageDirectory().toString();
        }
    }

    public String good3() {
        String sdcard = Environment.getExternalStorageState();
        if (sdcard.equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            return null;
        }
    }

    public void bad1() {
        String sdDirPath = Environment.getExternalStorageDirectory().toString();
    }

    public boolean check() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    private void s1() {
        good3();
    }



}
