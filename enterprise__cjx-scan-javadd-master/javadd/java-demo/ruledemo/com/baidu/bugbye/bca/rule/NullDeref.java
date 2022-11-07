package com.baidu.bugbye.bca.rule;

import com.baidu.bugbye.bca.supporter.Student;
import com.baidu.bugbye.bca.supporter.TestModel;

import java.util.ArrayList;
import java.util.List;

public class NullDeref {
    /*public void bad1() {
        Student student = null;
        student.toString();
    }

    public void bad2() {
        Student student;
        student = null;
        student.toString();
    }

    public void bad3(Student student) {
        if (student == null && student.getAge() == 0) {
            student.toString();
        }
    }

    public void bad4(Student student) {
        if (student.getAge() == 0 || student != null) {
            student.toString();
        }
    }

    public void bad5(Student student) {
        if (student == null) {
            student.toString();
        }
    }

    public void bad6(TestModel testModel) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        if (testModel == null && testModel.getAnInt() == 0
                && testModel.getOutputStream() != null) {
        }
    }

    public void bad7(TestModel testModel, boolean b) {
        boolean a = true;
        boolean c = true;
        boolean d = true;
        int i = 0;
        if (!(!((b) || ++i > 0 || testModel == null) && testModel.getAnInt() == 0)
                && testModel.getOutputStream() != null) {
            testModel.getAnInt();
            testModel.getOutputStream();
        }

    }

    public void bad8(TestModel testModel) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        int i = 0;
        if (!((testModel != null) && testModel.getAnInt() == 0) && testModel.getOutputStream() != null) {
            testModel.getAnInt();
            testModel.getOutputStream();
        }
    }

    List mOperatorRootView;

    public void good1() {
        if (mOperatorRootView != null) {
            ((ArrayList) mOperatorRootView).remove(1);
        }
    }

    List mDataList;
    TestModel testModel;

    private void good2() {
        if (testModel == null) {
            testModel = new TestModel();
            testModel.getString();
            testModel.getAnInt();
        }
    }

    private void good3() {
        if (testModel == null) {
            try {
                testModel = new TestModel();
                testModel.getString();
                testModel.getAnInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void good4() {
        if (testModel != null) {
            testModel.toString();
            testModel = null;
        }
        testModel = new TestModel();
        testModel.toString();
    }

    public void good5(TestModel testModel) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        int i = 0;
        if (!(testModel == null || testModel.getOutputStream() == null)) {
            testModel.getAnInt();
            testModel.getOutputStream();
        }
    }

    public void good6(Object obj, int a) {
        if (obj == null) {
            return;
        } else {

            if (a > 0) {
                obj.toString();
            } else if (obj.toString() != null || obj != null) {
                obj.getClass();
            }
        }

    }*/


}
