package Lab8.flywieght;

public class Client {

    public static void main(String[] args) {
        ConcreteCustomer concreteCustomer = CustomerFactory.getCustomer(City.Fairfield);
        concreteCustomer.logCustomerInfo("1", "Lukman", "Arogundade");

        UnsharedCustomer unsharedCustomer = new UnsharedCustomer(City.Grinnel, "Eniola");
        unsharedCustomer.logCustomerInfo("2", "Ademide", unsharedCustomer.getLastName());
    }

}
