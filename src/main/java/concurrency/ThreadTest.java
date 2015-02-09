package concurrency;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Thread().getName());
        System.out.println(new Thread().getName());
        System.out.println(new Thread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread(""+i){
                public void run(){
                    System.out.println("Thread "+getName()+" running");
                }
            }.start();
        }
    }
}
