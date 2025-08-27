public class RunableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread " + threadName + " started");
    }

    @Override
        public void run() {
        System.out.println("Running " + threadName);
        try{
            for(int i = 4 ; i> 0; i--){
                System.out.println(threadName + " " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if(t==null){
            t = new Thread(threadName);
            t.start();
        }
    }
}
