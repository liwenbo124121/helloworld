package com.baidu.bugbye.bca.rule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FragmentActivityRequestCode {

    public class good1 extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(android.R.layout.activity_list_item);
            startActivityForResult(new Intent(), 65536);

        }
    }

    public class good2 extends FragmentActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(android.R.layout.activity_list_item);
            startActivityForResult(new Intent(), 65535);
        }
    }

    public class bad1 extends FragmentActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(android.R.layout.activity_list_item);
            startActivityForResult(new Intent(), 65536);
        }
    }

    public class bad2 extends FragmentActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(android.R.layout.activity_list_item);
            int code = 65536;
            startActivityForResult(new Intent(), code);
        }
    }

    public class bad3 extends FragmentActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(android.R.layout.activity_list_item);
            int code = 1;
            code = 65536;
            startActivityForResult(new Intent(), code);
        }
    }
}
