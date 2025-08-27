

public class testCount {
    public static void main(String[] args) {
        Count counter = new Count();
        try{
            while(counter.getMythread().isAlive()){
                System.out.println("My thread is alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main is interrupted");
        }
        System.out.println("Main thread is over");
    }
}
