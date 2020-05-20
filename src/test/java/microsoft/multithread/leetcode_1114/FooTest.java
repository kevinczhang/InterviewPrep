package microsoft.multithread.leetcode_1114;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(ConcurrentTestRunner.class)
class FooTest {

    class PrintThread extends Thread {

        int num;

        public PrintThread(int toPrint) {
            this.num = toPrint;
        }

        public void run() {
            System.out.println(this.num);
        }
    }

    Thread printFirst = new PrintThread(1);
    Thread printSecond = new PrintThread(2);
    Thread printThird = new PrintThread(3);

    @Before
    public void initialStart(){
        printFirst.start();
        printSecond.start();
        printThird.start();
    }

    @Test
    void test123() {
        Foo foo = new Foo();

        try {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getId() == 1) {
                foo.first(printFirst);
            }
            if (currentThread.getId() == 3) {
                foo.third(printThird);
            }
            if (currentThread.getId() == 2) {
                foo.second(printSecond);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}