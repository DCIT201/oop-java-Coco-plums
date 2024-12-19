package agency;

import vehicle.Vehicle;
import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable() && vehicle.getModel().equalsIgnoreCase(model)) {
                return vehicle;
            }
        }
        return null;
    }

    public void processRental(Customer customer, String model, int days) {
        Vehicle vehicle = findAvailableVehicle(model);
        if (vehicle == null) {
            System.out.println("No available vehicles of the requested model.");
        } else {
            vehicle.setAvailable(false);
            customer.addRental(vehicle.getVehicleId());
            System.out.println("Rental processed for " + customer.getName());
        }
    }
}
