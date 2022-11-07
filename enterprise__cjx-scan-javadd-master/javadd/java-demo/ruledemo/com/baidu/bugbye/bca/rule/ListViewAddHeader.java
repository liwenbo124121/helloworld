package com.baidu.bugbye.bca.rule;

import android.widget.ListView;
import android.widget.TextView;

public class ListViewAddHeader {

    protected void good1() {
        ListView listView = getListView();
        addHeader(listView);
        listView.setAdapter(null);
    }

    public void bad1() {
        ListView listView = getListView();
        listView.setAdapter(null);
        addHeader(listView); // 这里会导致app crash
    }

    private void addHeader(ListView listView) {
        TextView textView = getTextView();
        listView.addHeaderView(textView);
    }

    private ListView getListView() {
        return (ListView) new Object();
    }

    private TextView getTextView() {
        return (TextView) new Object();
    }
}