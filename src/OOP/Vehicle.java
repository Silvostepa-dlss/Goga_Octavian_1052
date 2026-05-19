package OOP;

public abstract class Vehicle {
    private String brand;
    private double speed;
    private static int idCounter = 1;
    private final int ID;
    private int mileage;
    private boolean rented;
    private int lastServiceMileage;

    public Vehicle() {
        this.brand = "N/A";
        this.speed = (double)0.0F;
        this.ID = idCounter;
        incrementIdCounter();
        this.mileage = 0;
        this.rented = false;
        this.lastServiceMileage = 0;
    }

    public Vehicle(String brand, double speed, int mileage, boolean rented, int lastServiceMileage) {
        this.brand = brand;
        this.speed = speed;
        this.ID = idCounter;
        incrementIdCounter();
        this.mileage = mileage;
        this.rented = rented;
        this.lastServiceMileage = lastServiceMileage;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void incrementIdCounter() {
        ++idCounter;
    }

    public int getId() {
        return this.ID;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getLastServiceMileage() {
        return this.lastServiceMileage;
    }

    public void setLastServiceMileage(int lastServiceMileage) {
        this.lastServiceMileage = lastServiceMileage;
    }

    public boolean isRented() {
        return this.rented;
    }

    public void sound() {
        System.out.println("Nu stim ce sunet scoate masina asta");
    }

    public void move() {
        this.speed += (double)30.0F;
    }

    public void rent() {
        if (!this.rented) {
            this.rented = true;
        } else {
            throw new IllegalStateException("Eroare: Vehiculul a fost deja inchiriat");
        }
    }

    public void returnVehicle(int drivenKm) {
        if (!this.rented) {
            throw new IllegalStateException("Eroare: Vehiculul nu este inchiriat");
        } else if (drivenKm <= 0) {
            throw new IllegalArgumentException("Eroare: Valoarea introdusa este invalida");
        } else {
            this.mileage += drivenKm;
            this.rented = false;
        }
    }

    public abstract boolean needsService();

    public abstract double rentalPrice(int var1);
}
