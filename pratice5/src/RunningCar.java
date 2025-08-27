public class RunningCar {
    public static int DISTANCE = 100;
    public static int STEP = 2;
    public static void main(String[] args) {
        Car car1 = new Car("A");
        Car car2 = new Car("B");
        Car car3 = new Car("C");

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);

        System.out.println("Distance: 100Km");
        t1.start();
        t2.start();
        t3.start();


    }
}
