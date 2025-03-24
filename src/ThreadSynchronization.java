class Counter {
    private int count = 0;

    public void increment(){
        synchronized(this){
        count++;
        }
    }

    public int getCount(){
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()-> {
            for(int i = 0; i<10000; i++){
                counter.increment();
                if (i%1000==0){
                    System.out.println("Currrent count is "+counter.getCount());
                }
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                
            }
        });
        t1.start();
        t1.join();

    System.out.println("Final Count: " + counter.getCount());
    
}
}