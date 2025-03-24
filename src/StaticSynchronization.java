class SharedResource{
    public static  synchronized void staticMethod(){
        System.out.println("Thread"+ Thread.currentThread().getName()+" is executing");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread"+ Thread.currentThread().getName()+" has executed");
    }
    public class StaticSynchronization {
        public static void main(String[] args) {
            Thread t1 = new Thread(SharedResource::staticMethod,"T1");
            Thread t2 = new Thread(SharedResource::staticMethod,"T2");

            t1.start();
            t2.start();
        }
    }
}