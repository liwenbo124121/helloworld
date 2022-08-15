package com.baidu.bugbye.bca.rule;

public class DeadStoreInSwitch {
    public void good1() {
        int i = 5;
        switch (i) {
            case 1: {
                int toAssign;
                toAssign = 5;
            }
            case 3:
                break;
        }
    }

    public void good2() {
        int i = 5;
        int toAssign;
        switch (i) {
            case 1: {
                toAssign = 5;
                toAssign = toAssign + 5;
            }
            case 3:
                break;
        }
    }

    public void bad1() {
        int i = 5;
        int toAssign = 0;
        switch (i) {
            case 1: {
                toAssign = 2;
            }
            case 2:
                toAssign = 3;
            case 3:
                return;
        }
    }

    public void bad2() throws Exception {
        int i = 5;
        int toAssign = 0;
        switch (i) {
            case 1:
                toAssign = 2;
            case 2:
                throw new Exception("a");
        }
    }

    public void bad3() throws Exception {
        int i = 5;
        int toAssign = 0;
        switch (i) {
            case 1:
                toAssign = 2;
            case 2:
                return;
        }
    }
}
