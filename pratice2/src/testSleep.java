public class testSleep {
    public static void main(String[] args) throws InterruptedException {
        SleepExample sleepExample1 = new SleepExample();
        SleepExample sleepExample2 = new SleepExample();
        sleepExample1.start();
        sleepExample1.join();
        sleepExample2.start();
        //sleepExample2.join();

    }
}
