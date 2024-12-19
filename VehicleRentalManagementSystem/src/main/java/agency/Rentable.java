package agency;

import customer.Customer;

public interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}
