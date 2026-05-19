package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();
        Vehicle[] var = new Vehicle[]{ car, motorcycle, truck };
        car.move();
        motorcycle.move();
        truck.move();
        System.out.println(car.equals(car2));
    }
}
