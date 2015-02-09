package concurrency;


//ThreadLocal class in Java enables you to create variables that can only be read
//and written by the same concurrency. Thus, even if two threads are executing the same code,
//and the code has a reference to a ThreadLocal variable,
//then the two threads can not see each other's ThreadLocal variable
public class ThreadLocalTest {

    public static class MyRunnable implements Runnable {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
        private int anInt;

        @Override
        public void run() {
            double v = Math.random() * 100;
            anInt = (int) v;
            threadLocal.set((int) v);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("threadLocalValue "+threadLocal.get()+ " anIntValue "+anInt);
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();

    }

}
