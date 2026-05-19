package OOP;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String brand, double speed, int mileage, boolean rented, int lastServiceMileage, int loadCapacity) {
        super(brand, speed, mileage, rented, lastServiceMileage);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    public void sound() {
        System.out.println("Sunet de camion");
    }

    public boolean needsService() {
        if (this.getMileage() - this.getLastServiceMileage() >= 15000) {
            this.setLastServiceMileage(this.getMileage());
            return true;
        } else {
            return false;
        }
    }

    public double rentalPrice(int days) {
        return ((double)80.0F + 0.02 * (double)this.getLoadCapacity()) * (double)days;
    }
}
