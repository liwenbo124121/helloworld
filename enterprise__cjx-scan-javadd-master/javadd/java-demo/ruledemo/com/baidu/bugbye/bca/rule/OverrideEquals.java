package com.baidu.bugbye.bca.rule;

public class OverrideEquals {

    class Good1 {
        @Override
        public boolean equals(Object object) {
            return true;
        }
    }

    class Good1Child extends Good1 {
        @Override
        public boolean equals(Object object) {
            return true;
        }
    }

    class Bad1 {
        @Override
        public boolean equals(Object object) {
            if (!(object instanceof Bad1)) {
                return false;
            }
            return true;
        }
    }

    class Bad1Child extends Bad1 {
        @Override
        public boolean equals(Object object) {
            if (!(object instanceof Bad1Child)) {
                return false;
            }
            return true;
        }
    }

}
