import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while(runDistance < RunningCar.DISTANCE){
            try{
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance*100)/RunningCar.DISTANCE;
                for(int i = 0; i < RunningCar.DISTANCE; i+= RunningCar.STEP){
                    if(percentTravel >= i +  RunningCar.STEP){
                        log += "=";
                    }else if(percentTravel >= i && percentTravel < i +  RunningCar.STEP){
                        log += "o";
                    }else{
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" +this.name + ":" + log + ""+ Math.min(RunningCar.DISTANCE, runDistance)+"Km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " Interrupted");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car"+ this.name + " Finish in" + (endTime-startTime)/1000 + " seconds");

    }
}
