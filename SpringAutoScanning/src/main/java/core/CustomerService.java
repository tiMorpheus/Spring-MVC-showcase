package core;

public class CustomerService {

    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerDao=" + customerDao +
                '}';
    }
}
