package OOP;

public class Car extends Vehicle{
    private int doors;

    public Car() {
    }

    public Car(String brand, double speed, int mileage, boolean rented, int lastServiceMileage, int doors) {
        super(brand, speed, mileage, rented, lastServiceMileage);
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void sound() {
        System.out.println("Sunet de masina");
    }

    public boolean equals(Car obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            return this.getBrand().equals(obj.getBrand()) && this.getSpeed() == obj.getSpeed();
        } else {
            return false;
        }
    }

    public boolean needsService() {
        if (this.getMileage() - this.getLastServiceMileage() >= 10000) {
            this.setLastServiceMileage(this.getMileage());
            return true;
        } else {
            return false;
        }
    }

    public double rentalPrice(int days) {
        return this.getDoors() >= 4 ? (double)(50 * days) * 1.1 : (double)(50 * days);
    }
}
