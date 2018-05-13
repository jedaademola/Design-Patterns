package Lab8.builder;


public class Client {

    public static void main(String[] args) {
        Call call = new Call();
        call.setRequestId("001");
        Address address = new Address("1000N 4th street", "Fairfied", "Iowa", "52557");
        call.setAgent(new Agent("1001", address));


        Director d = new Director(new RequestBuilder(call));

        // first ask about customer info
        d.buildCustomer("Lukman", "Arogundade", "9293138539", "arogundadel@gmail.com");

        // recording customer request
        d.buildRequest("Need more assistance", "assited");

        // conclude the call record
        d.buildConclusion(true, false);

        // get request object
        Request r = d.getRequest();

        // save the request into database
        System.out.println(r.toString());
    }

}
