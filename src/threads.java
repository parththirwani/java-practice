public class threads{
        public static void main(String[] args){
            Thread t1 = new Thread(()-> System.out.println("Hello from thread t1"));
            Thread t2 = new Thread(()-> System.out.println("Hello from thread t2"));
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.start();
            t1.start();
        }
    }
