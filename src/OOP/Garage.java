package OOP;

public class Garage {
    private Vehicle[] fleet;
    private int size;

    public Garage() {
        this.size = 0;
        this.fleet = new Vehicle[10];
    }

    public Garage(Vehicle[] fleet, int size) {
        if (fleet != null && size <= fleet.length) {
            this.size = size;
            this.fleet = new Vehicle[fleet.length];

            for(int i = 0; i < size; ++i) {
                this.fleet[i] = fleet[i];
            }

        } else {
            throw new IllegalArgumentException("Eroare: parametri invalizi");
        }
    }

    public int getSize() {
        return this.size;
    }

    public void addVehicle(Vehicle obj) {
        if (this.size == this.fleet.length) {
            throw new IllegalStateException("Eroare: Garajul este plin");
        } else {
            for(int i = 0; i < this.size; ++i) {
                if (this.fleet[i].getId() == obj.getId()) {
                    throw new IllegalArgumentException("Eroare: Vehiculul e deja în garaj!");
                }
            }

            this.fleet[this.size] = obj;
            ++this.size;
        }
    }
}
