package modernjavainaction.chapternine.templatemethod.lambda;

import modernjavainaction.chapternine.templatemethod.Customer;

import java.util.function.Consumer;

public class OnlineBankingLambda {
    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer customer = new Customer(id);
        makeCustomerHappy.accept(customer);
    }

    public static void main(String[] args) {
        new OnlineBankingLambda().processCustomer(22,
                customer -> System.out.println(customer.getId() + " is happy"));
    }
}
