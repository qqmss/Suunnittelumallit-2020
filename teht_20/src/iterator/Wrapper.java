package iterator;

import java.util.Iterator;

public class Wrapper {

    private Iterator<Integer> iterator;
    private volatile Thread lastThread;
    //private static long time = System.nanoTime();

    public Wrapper(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public synchronized Integer next() {
        //System.out.println(System.nanoTime() - time + " " + lastThread + " " + Thread.currentThread());
        if(lastThread == null) {
            lastThread = Thread.currentThread();
        }
        while (Thread.currentThread().equals(lastThread) && iterator.hasNext()){
            try {
                //System.out.println("no");
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lastThread = Thread.currentThread();
        Integer integer;
        if(iterator.hasNext()) {
            integer = iterator.next();
        } else {
            integer = null;
            notifyAll();
        }
        //System.out.println(integer + " " +  Thread.currentThread().getName());
        return integer;
    }
}
