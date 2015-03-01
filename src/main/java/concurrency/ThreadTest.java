package concurrency;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

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

        new Date();

    }
}
