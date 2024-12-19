package customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String customerId;
    private final String name;
    private final List<String> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(String vehicleId) {
        rentalHistory.add(vehicleId);
    }

    public List<String> getRentalHistory() {
        return rentalHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", rentalHistory=" + rentalHistory +
                '}';
    }

//    public String getName() {
//    }
}
