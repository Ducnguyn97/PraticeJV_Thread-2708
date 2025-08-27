public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunableDemo runnableDemo1 = new RunableDemo("Thread1-HR-Database");
        runnableDemo1.start();
        runnableDemo1.run();

        RunableDemo runnableDemo2 = new RunableDemo("Thread2-send-Email");
        runnableDemo2.start();
        runnableDemo2.run();

        System.out.println("Main thread stoped...");
    }

}
