/**
 * interviewers interested in solving producer consumer problem from scratch to
 * evaluate multi threading skills
 * 
 * need three components: 1. a blocking queue 2. produce thread 3. consumer
 * thread
 */

 // BlockingQueue (Using Intrinsic Locking)
 // implement our own simple thread-safe version of BlockingQueue using synchronization
class BlockingQueue {
    final Object[] items = new Object[100];
    int putptr, takeptr, count;
    private boolean closed = false;

    public synchronized void put(Object x) throws InterruptedException {
        while (count == items.length)
            wait();
        items[putptr] = x;
        if (++putptr == items.length)
            putptr = 0;
        ++count;
        notifyAll();
    }

    public synchronized Object take() throws InterruptedException {
        while (count == 0)
            wait();
        Object x = items[takeptr];
        if (++takeptr == items.length)
            takeptr = 0;
        --count;
        notifyAll();
        return x;
    }

    public synchronized boolean isClosed() {
        return closed;
    }

    public synchronized void setClosed(boolean closed) {
        this.closed = closed;
    }
}
 //A producer is nothing but a thread puts task into BlockingQueue
 // till the queue is full.
public class Producer implements Runnable {
    private final BlockingQueue<SquareTask> queue;

    Producer(BlockingQueue<SquareTask> q) {
        queue = q;
    }

    public void run() {
        try {
            while (!queue.isClosed()) {
                queue.put(produce());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private SquareTask produce() {
        return new SquareTask(ThreadLocalRandom.current().nextInt(1, 200));
    }
}
//A consumer listens on BlockingQueue and keeps consuming the tasks waiting if queue is empty.
public class Consumer implements Runnable {
    private final BlockingQueue<SquareTask> queue;

    Consumer(BlockingQueue<SquareTask> q) {
        queue = q;
    }

    public void run() {
        try {
            while (!queue.isClosed()) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void consume(SquareTask x) {
        System.out.println(x.execute());
    }
}
public class producerConsumer {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<SquareTask> boundedBuffer = new BlockingQueue<>();
        Producer p = new Producer(boundedBuffer);
        Consumer c1 = new Consumer(boundedBuffer);
        Consumer c2 = new Consumer(boundedBuffer);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
        Thread.sleep(100);
        boundedBuffer.setClosed(true);
    }

}
