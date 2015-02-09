package concurrency;

public class MultiThreadTest {
    public static class Counter {

        private int count = 0;

        public void add(long value) {
            this.count += value;
        }

        public int getCount() {
            return count;
        }

    }

    public static void main(String[] args) {
        final Counter counter = new Counter();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("2222222 before "+counter.getCount());
                counter.add(2);
                System.out.println("22222222 after "+counter.getCount());
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("33333333  before   "+counter.getCount());
                counter.add(3);
                System.out.println("33333333  after   "+counter.getCount());
            }
        };
        thread2.start();
        thread1.start();

        System.out.println(counter.getCount()+"   final");
    }
}
