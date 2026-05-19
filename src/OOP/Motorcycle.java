package OOP;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(String brand, double speed, int mileage, boolean rented, int lastServiceMileage, boolean hasSidecar) {
        super(brand, speed, mileage, rented, lastServiceMileage);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public void sound() {
        System.out.println("Sunet de motocicleta");
    }

    public boolean needsService() {
        if (this.getMileage() - this.getLastServiceMileage() >= 6000) {
            this.setLastServiceMileage(this.getMileage());
            return true;
        } else {
            return false;
        }
    }

    public double rentalPrice(int days) {
        return this.isHasSidecar() ? (double)(45 * days) : (double)(30 * days);
    }
}
