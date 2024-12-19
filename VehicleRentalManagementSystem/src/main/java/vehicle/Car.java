package vehicle;

public class Car extends Vehicle {
    private final double insuranceRate;

    public Car(String vehicleId, String model, double baseRentalRate, double insuranceRate) {
        super(vehicleId, model, baseRentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + insuranceRate;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
