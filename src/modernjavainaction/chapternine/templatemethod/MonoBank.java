package modernjavainaction.chapternine.templatemethod;

public class MonoBank extends OnlineBanking {
    @Override
    void makeCustomerHappy(Customer customer) {
        System.out.println(customer.getId() + " is happy");
    }
}
