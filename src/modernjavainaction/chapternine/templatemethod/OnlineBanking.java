package modernjavainaction.chapternine.templatemethod;

public abstract class OnlineBanking {

    public void processCustomer(int id) {
        Customer customer = new Customer(id);
        makeCustomerHappy(customer);
    }

    abstract void makeCustomerHappy(Customer customer);
}
