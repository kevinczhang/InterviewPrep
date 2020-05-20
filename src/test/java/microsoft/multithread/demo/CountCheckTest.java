package microsoft.multithread.demo;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(ConcurrentTestRunner.class)
class CountCheckTest {

    private CountCheck counter = new CountCheck();
    private final static int THREAD_COUNT = 5;

    @Before
    public void initialCount(){
        counter.initialize(2);
    }

    @Test
    @ThreadCount(THREAD_COUNT)
    public void addOne() {
        counter.addOne();
        System.out.println("testing");
    }

    @After
    public void testCount() {
        assertEquals(7, counter.getCount());
    }
}