package com.baidu.bugbye.bca.rule;

import android.app.Fragment;

public class SuperFunctionCall extends Fragment {

    /**
     * good
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    /**
     * bad
     */
    @Override
    public void onStop() {
        String dosometion = "Do Something";
    }


}
