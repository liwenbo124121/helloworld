package com.baidu.bugbye.bca.rule.customization.simeji;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import com.baidu.simeji.widget.ViewPagerFixed;

import java.util.ArrayList;
import java.util.List;

public class ExtendsViewPager extends Activity {

    public ViewPager viewPager;
    public List<ViewPager> viewList;

    public void bad1(int id) {
        ViewPager viewPager = (ViewPager) findViewById(id);
        this.viewPager = viewPager;
    }

    public void bad2(int id) {
        ViewPager viewPager;
        viewPager = (ViewPager) findViewById(id);
        this.viewPager = viewPager;
    }

    public void bad3(int id) {
        viewList = new ArrayList<ViewPager>();
        viewList.add((ViewPager) findViewById(id));
    }

    public void good1(int id) {
        ViewPager viewPager = (ViewPagerFixed) findViewById(id);
        this.viewPager = viewPager;
    }

    public void good2(int id) {
        ViewPagerFixed viewPager = (ViewPagerFixed) findViewById(id);
        this.viewPager = viewPager;
    }
}
