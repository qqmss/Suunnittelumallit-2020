package iterator;

import java.util.Iterator;

public class Print implements Runnable{

    Iterator iterator;
    String name;

    public Print(Iterator iterator, String name) {
        this.name = name;
        this.iterator = iterator;
    }

    @Override
    public void run() {
        while (iterator.hasNext()){
            System.out.println(iterator.next() + name);
            Thread.yield();
        }
    }


}
