package com.baidu.bugbye.bca.rule;

public class EqualsAlwaysTrue {

    class bad1 {
        public boolean equals(Object o) {
            return true;
        }

        public int hashCode() {
            return 0;
        }
    }

    class bad2 {
        public boolean equals(Object o) {
            if (o.toString() == "123") {
                return true;
            }

            if (o.hashCode() > 0) {
                return true;
            }
            return true;
        }

        public int hashCode() {
            return 0;
        }
    }

    class good1 {
        public boolean equals(Object o) {
            if (o.toString() == "123") {
                return true;
            }

            if (o.hashCode() > 0) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 0;
        }
    }
}
