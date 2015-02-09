package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSubClass extends Thread{


//    The run() method is what is executed by the concurrency after you call start()
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread sub class running");
    }

    public static void main(String[] args) {
        ThreadSubClass thread = new ThreadSubClass();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");//时:分:秒:毫秒
//        If we call run() method directly, then the run() method is executed by the current
//        concurrency instead of the the concurrency we created.
        System.out.println(sdf.format(new Date())+" before start()");
        thread.start();
        System.out.println(sdf.format(new Date())+" after start()");
        System.out.println(sdf.format(new Date())+" before run()");
        thread.run();
        System.out.println(sdf.format(new Date())+" after run()");

    }
}
