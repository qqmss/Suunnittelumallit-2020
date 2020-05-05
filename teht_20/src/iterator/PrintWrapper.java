package iterator;

public class PrintWrapper extends Thread{

    Wrapper wrapper;

    public PrintWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void run() {
        for(Integer integer = wrapper.next(); integer != null; integer = wrapper.next()){
            System.out.println(integer + " " + Thread.currentThread().getName());

        }
    }
}
