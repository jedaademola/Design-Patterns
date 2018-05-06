package Lab6.ChainOfResponsability;


import Lab6.ChainOfResponsability.model.Address;
import Lab6.ChainOfResponsability.model.CallRecord;
import Lab6.ChainOfResponsability.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private ChainBuilder chain = new ChainBuilder();

    public static void main(String[] args) {
        List<CallRecord> request = new ArrayList<>();

        CallRecord callRecord = new CallRecord();
        Customer customer = new Customer();
        customer.setFirstName("Lukman");
        customer.setLastName("Arogundade");
        customer.setEmail("lukman.arogundade@gmail.com");
        Address address = new Address();
        address.setState("IA");
        customer.setAddress(address);

        callRecord.setCustomer(customer);


        CallRecord callRecord2 = new CallRecord();
        Customer customer2 = new Customer();
        customer2.setFirstName("Carlton");
        customer2.setLastName("Ellis");
        customer2.setEmail("cellis@yahoo.com");

        Address address2 = new Address();
        address2.setState("NY");
        customer2.setAddress(address2);

        callRecord2.setCustomer(customer2);


        CallRecord callRecord3 = new CallRecord();
        Customer customer3 = new Customer();
        customer3.setFirstName("David");
        customer3.setLastName("Otiego");
        customer3.setEmail("davioo@yahoo.com");


        callRecord3.setCustomer(customer3);

        request.add(callRecord);
        request.add(callRecord2);
        request.add(callRecord3);

        Client client = new Client();

        client.chain.getHandler().handleRequest(request);

    }

    public void sendRequest(List<CallRecord> request) {
        chain.getHandler().handleRequest(request);
    }

}
