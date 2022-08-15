package com.baidu.bugbye.bca.rule;

public class EqualsOverload {
    class Bad1 {
        private String f1;

        public String getF1() {
            return f1;
        }

        public void setF1(String f1) {
            this.f1 = f1;
        }

        public boolean equals(Bad1 eqSelfUseObject) {
            boolean result = true;
            result &= eqSelfUseObject.getF1().equals(this.f1);
            return result;
        }

        public int hashCode() {
            return 0;
        }
    }

    class Good1 {
        private String f1;

        public String getF1() {
            return f1;
        }

        public void setF1(String f1) {
            this.f1 = f1;
        }

        public boolean equals(Object eqSelfUseObject) {
            boolean result = true;
            result &= ((Good1) eqSelfUseObject).getF1().equals(this.f1);
            return result;
        }

        public int hashCode() {
            return 0;
        }
    }
}
