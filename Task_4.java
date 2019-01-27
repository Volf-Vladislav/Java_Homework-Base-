// Главный класс
public class Task_4 {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.isGoes();
        car.refuel();
        car.getFuelLevel();
        car.stop();
    }
}

// Класс с методами
class Car {
    static int fuel = 10;
    static int metres = 0;
    static boolean startStop;


    void start() {
        startStop = true;
        System.out.println("Car started");
        while (fuel > 0 && startStop) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            metres++;
            fuel--;
            System.out.println("Distance traveled: " + metres + " metres");
        }
        startStop = false;
    }

    boolean stop() {
        System.out.println("Car was stopped");
        startStop = false;
        return startStop;
    }
    boolean isGoes() {
        if ((fuel > 1)&&(startStop)) {
            System.out.println("Car in motion");
            return false;
        }
        else {
            System.out.println("Car not in motion");
            return true;
        }

    }
    void refuel() {
        System.out.println("Car is full");
        fuel = 10;
    }
    int getFuelLevel() {
        System.out.println("Fuel level is = " + fuel);
        return fuel;
    }

}