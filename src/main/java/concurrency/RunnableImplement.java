package concurrency;

public class RunnableImplement implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable implement running");
    }

    public static void main(String[] args) {
        RunnableImplement runnable = new RunnableImplement();

        runnable.run();
        new Thread(runnable).start();
        new Thread(runnable).run();

    }
}
