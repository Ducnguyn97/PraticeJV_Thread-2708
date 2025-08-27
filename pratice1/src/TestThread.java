public class TestThread{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();// tạo luồng mơí rồi chạy run() luồng mới
        t1.run();// chạy trên luồng main
        MyThread t2 = new MyThread();
        t2.start();
        t2.run();

    }
}
