package iterator;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();

        for(int i = 1; i < 100; i++){
            integers.add(i);
        }


        Iterator iterator = integers.iterator();
        Runnable runnable = new Print(iterator, " 1");
        Runnable runnable1 = new Print(iterator, " 2");
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1-----------------");
        Iterator iterator1 = integers.iterator();
        Iterator iterator2 = integers.iterator();
        Runnable runnable2 = new Print(iterator1, " 3");
        Runnable runnable3 = new Print(iterator2, " 4");
        Thread thread2 =  new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread2.start();
        thread3.start();

        try {
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("2-----------------");
        Wrapper wrapper = new Wrapper(integers.iterator());
        Thread thread4 = new PrintWrapper(wrapper);
        Thread thread5 = new PrintWrapper(wrapper);
        thread4.start();
        thread5.start();

        try {
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("3-----------------");
        Iterator<Integer> iterator3 = integers.iterator();
        try {
            while (iterator3.hasNext()) {
                integers.add(100);
                System.out.println(iterator3.next());
            }
        }catch (ConcurrentModificationException ex){
            System.out.println(ex);
        }


        System.out.println("4-----------------");
        System.out.println("size: " + integers.size());
        Iterator<Integer> iterator4 = integers.iterator();
        try {
            while (iterator4.hasNext()) {
                Integer integer = iterator4.next();
                if(integer % 2 == 0) {
                    iterator4.remove();
                }
            }
        }catch (ConcurrentModificationException ex){
            ex.printStackTrace();
        }
        System.out.println("size: " + integers.size());






    }
}
