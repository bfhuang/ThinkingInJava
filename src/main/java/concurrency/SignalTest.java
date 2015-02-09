package concurrency;


//the purpose of concurrency signaling is to enable threads to send signals to each other.
//Additionally, concurrency signaling enables threads to wait for signals from other threads.
//For instance, a concurrency B might wait for a signal from concurrency A indicating the data is
//ready to be processed.
public class SignalTest {

    public static class Counter {

        private int count = 0;


//        A concurrency that calls wait() on any object becomes inactive until another concurrency
//        calls notify() on that object. In order to call either wait() or notify() the calling
//        concurrency must first obtain the lock on that object. In other words, the calling concurrency
//        must call wait() or notify() from inside a synchronized block.
        public void doWait() {
            synchronized (this) {
                try {
                    System.out.println("begin waiting");
                    this.wait();
                    System.out.println("after waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end");
            }
        }

        public void doNotify() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("notify");
            synchronized (this) {
                this.notify();
            }
        }

        public void doNotifyAll() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("notifyAll");
            synchronized (this) {
                this.notifyAll();
            }
        }

    }

    public static void main(String[] args) {
         final Counter counter = new Counter();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread1 running");
                counter.doWait();
                System.out.println("Thread1 finish");
            }
        };

        final Counter counter1 = new Counter();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread2 running");
                counter.doWait();
                System.out.println("Thread2 finish");
            }
        };



        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread3 running");
//                The concurrency calls notify() on counter, only the threads waiting on counter
//                will awake.
//                notifyAll() will awake all the waiting concurrency
                counter.doNotify();
                System.out.println("Thread3 finish");
            }
        };
        thread3.start();
        thread1.start();

    }
}
