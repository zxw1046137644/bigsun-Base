


public class day0ThreadTest {
    /**
     * 多线程的简单实现
     * @param args
     */
    public static void main(String[] args) {
        ThreadT2 th = new ThreadT2();
        ThreadT2 th2 = new ThreadT2();
        ThreadT2 th3 = new ThreadT2();
        new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        th.setPriority(Thread.MAX_PRIORITY);

        th.start();
        th2.start();
        th3.start();

    }

    static class ThreadT2 extends Thread {
        private static int ticket = 100;

        @Override
        public void run() {
            while (true) {
                if (ticket > 0) {
                    System.out.println("还有票" + ticket);
                    ticket--;
                } else {
                    System.out.println("没票了");
                    break;
                }
            }
        }
    }

    static class ThreadT1 extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
