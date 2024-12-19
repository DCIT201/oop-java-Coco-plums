package agency;

import customer.Customer;
import vehicle.Vehicle;
import java.time.LocalDate;

public class RentalTransaction {
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double totalCost;

    public RentalTransaction(String transactionId, Customer customer, Vehicle vehicle, int rentalDays) {
        if (transactionId == null || customer == null || vehicle == null || rentalDays <= 0) {
            throw new IllegalArgumentException("Invalid transaction details.");
        }
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = LocalDate.now();
        this.returnDate = rentalDate.plusDays(rentalDays);
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", totalCost=" + totalCost +
                '}';
    }
}
