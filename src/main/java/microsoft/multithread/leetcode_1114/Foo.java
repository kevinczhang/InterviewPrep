package microsoft.multithread.leetcode_1114;

class Foo {

    private int i = 1;

    private Object o = new Object();

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (o) {
            while (i != 1) {
                o.wait();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            i = 2;
            o.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (o) {
            while (i != 2) {
                o.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            i = 3;
            o.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (o) {
            while (i != 3) {
                o.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            i = 1;
            o.notifyAll();
        }
    }
}
