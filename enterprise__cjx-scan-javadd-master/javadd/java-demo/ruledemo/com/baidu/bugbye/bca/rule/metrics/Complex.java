package com.baidu.bugbye.bca.rule.metrics;

import java.io.IOException;
import java.util.logging.Logger;

public class Complex {

    public void testIf1(int b1, int b2) {
        if (b1 == 1) {
            Logger.getLogger("").info(String.valueOf("b1 == 1"));
            if (b2 == 11) {
                if (b2 == 111) {
                    Logger.getLogger("").info("b2 == 111");
                } else {
                    Logger.getLogger("").info("b2 == 111 else");
                }
                if (b2 == 222) {
                    Logger.getLogger("").info("b2 == 222");
                } else {
                    Logger.getLogger("").info("b2 == 222 else");
                }
                Logger.getLogger("").info("b2 == 11");
            } else {
                Logger.getLogger("").info("b2 == 11 else");
                if (b1 == 333) {
                    Logger.getLogger("").info("b1 == 333");
                } else {
                    Logger.getLogger("").info("b1 == 333 else");
                }
            }
        } else if (b1 == 2) {
            Logger.getLogger("").info("b1 == 2");
            if (b1 == 22) {
                Logger.getLogger("").info("b1 == 22");
            } else if (b1 == 23) {
                Logger.getLogger("").info("b1 == 23");
            } else {
                Logger.getLogger("").info("b1 == 22 else");
            }
        } else if (b1 == 3) {
            Logger.getLogger("").info("b1 == 3");
            if (b1 == 33) {
                Logger.getLogger("").info("b1 == 33");
            } else {
                Logger.getLogger("").info("b1 == 33 else");
            }
        } else if (b1 == 4) {
            Logger.getLogger("").info("b1 == 4");
        } else if (b1 == 5) {
            Logger.getLogger("").info("b1 == 5");
        } else if (b1 == 6) {
            Logger.getLogger("").info("b1 == 6");
        } else {
            Logger.getLogger("").info("b1 == 6 else");
            if (b1 == 66) {
                Logger.getLogger("").info("b1 == 66");
            } else {
                Logger.getLogger("").info("b1 == 66 else");
            }
        }
    }

    int id;

    public void testIf2() {

        if (1 == 1) {
            if (11 == 11) {
                this.id = 11;
                if (111 == 111) {
                    this.id = 111;
                    if (1111 == 1111) {
                        this.id = 1111;
                    }
                }
            }

            if (12 == 12) {
                this.id = 12;
            } else if (13 == 13) {
                this.id = 13;
            }

            if (15 == 15) {
                this.id = 15;
            }
        } else if (2 == 2) {
            if (21 == 21) {
                this.id = 21;
            }

            if (22 == 22) {
                this.id = 22;
            } else if (23 == 23) {
                this.id = 23;
            } else {
                this.id = 24;
            }
        } else {
            if (10 == 10) {
                this.id = 10;
            }

            if (20 == 20) {
                this.id = 20;
            } else if (30 == 30) {
                this.id = 30;
            } else {
                this.id = 40;
            }
        }
    }

    public void testForStatement() {
        for (int i = 1; i < 10; i++) {
            Logger.getLogger("").info(String.valueOf("for (int i = 1; i < 10; i++)"));

            for (int j = 1; j < 10; j++) {
                Logger.getLogger("").info(String.valueOf("for (int j = 1; j < 10; j++) {"));
            }
        }
        for (int j = 1; j < 10; j++) {

        }
    }

    public void testBlock() {
        {
            {
                Logger.getLogger("").info(String.valueOf("for (int j = 1; j < 10; j++) {"));
            }
        }

        {
            {
                {

                }
            }
            {

            }
        }
    }

    public void testWhile(int b1, int b2) {
        while (b1 == 1) {
            Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
        }
        do {
            Logger.getLogger("").info(String.valueOf("do while (b1 == 1)"));
        } while (b1 == 1);

        while (b1 == 1) {
            Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            do {
                while (b1 == 1) {
                    Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                }
                Logger.getLogger("").info(String.valueOf("do while (b1 == 1)"));
            } while (b1 == 1);
        }
    }

    public void testSwitch(int b1, int b2) {

        switch (b1) {
            case 1:
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                while (b1 == 1) {
                    Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                }
                do {
                    Logger.getLogger("").info(String.valueOf("do while (b1 == 1)"));
                } while (b1 == 1);
                break;
            case 2:
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            case 3:
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            default:
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
                break;
        }
        while (b1 == 1) {
            Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
        }
        do {
            Logger.getLogger("").info(String.valueOf("do while (b1 == 1)"));
        } while (b1 == 1);
    }

    public void testTryCatchFinally(int b1, int b2) {
        try {
            if (b1 == 1) {
                throw new IOException();
            }
            Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            while (b1 == 1) {
                Logger.getLogger("").info(String.valueOf("while (b1 == 1)"));
            }
            do {
                Logger.getLogger("").info(String.valueOf("do while (b1 == 1)"));
            } while (b1 == 1);
        } catch (IOException e) {
            Logger.getLogger("").info(String.valueOf("IOException while (b1 == 1)"));
            Logger.getLogger("").info(String.valueOf("IOException while (b1 == 1)"));
            while (b1 == 1) {
                Logger.getLogger("").info(String.valueOf("IOException while (b1 == 1)"));
            }
            do {
                Logger.getLogger("").info(String.valueOf("IOException do while (b1 == 1)"));
            } while (b1 == 1);
        } catch (Exception e) {
            Logger.getLogger("").info(String.valueOf("Exception while (b1 == 1)"));
        } finally {
            Logger.getLogger("").info(String.valueOf("finally while (b1 == 1)"));
            Logger.getLogger("").info(String.valueOf("finally while (b1 == 1)"));
            while (b1 == 1) {
                Logger.getLogger("").info(String.valueOf("finally while (b1 == 1)"));
            }
            do {
                Logger.getLogger("").info(String.valueOf("finally do while (b1 == 1)"));
            } while (b1 == 1);
        }
    }
}
