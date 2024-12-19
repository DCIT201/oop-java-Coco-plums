package vehicle;

public class Truck extends Vehicle {
    private final double weightChargePerTon;

    public Truck(String vehicleId, String model, double baseRentalRate, double weightChargePerTon) {
        super(vehicleId, model, baseRentalRate);
        this.weightChargePerTon = weightChargePerTon;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + weightChargePerTon * 10; // Example calculation
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
