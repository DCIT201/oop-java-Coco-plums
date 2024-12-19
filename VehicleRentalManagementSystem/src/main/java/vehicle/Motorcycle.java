package vehicle;

public class Motorcycle extends Vehicle {
    private final double helmetCharge;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, double helmetCharge) {
        super(vehicleId, model, baseRentalRate);
        this.helmetCharge = helmetCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + helmetCharge;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
