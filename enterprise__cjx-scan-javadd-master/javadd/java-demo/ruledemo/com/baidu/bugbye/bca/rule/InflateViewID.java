package com.baidu.bugbye.bca.rule;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

public class InflateViewID {

    public void good2(LayoutInflater inflater) {
        View headView = inflater.inflate(android.R.layout.simple_list_item_1, null);
        ListView myListView = null;
        myListView = (ListView) headView.findViewById(android.R.layout.simple_list_item_1);
        if (null != myListView) {
            myListView.addHeaderView(headView);
        }
    }

    public void bad1(LayoutInflater inflater) {
        View headView = inflater.inflate(android.R.layout.simple_list_item_1, null);
        ListView myListView = null;
        myListView = (ListView) headView.findViewById(37149);
        myListView.addHeaderView(headView);
    }

    public class Good1 extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            LayoutInflater inflater = this.getLayoutInflater();
            View headView = inflater.inflate(android.R.layout.simple_list_item_1, null);
            ListView myListView = (ListView) headView.findViewById(android.R.layout.simple_list_item_1);
        }
    }


}
