package microsoft.multithread.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class CountCheck {

    private final AtomicInteger count = new AtomicInteger();

    public void initialize(int number){
        count.set(number);
    }

    public void addOne() {
        count.incrementAndGet();
        System.out.println("testing");
    }

    public int getCount() {
        return count.get();
    }
}

