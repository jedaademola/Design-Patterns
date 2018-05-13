/*
 * Created on Jan 22, 2018
 */
package Lab8.builder;


public class Director {
    IRequestBuilder builder;

    public Director(IRequestBuilder builder) {
        this.builder = builder;
    }

    public void buildRequest(String reqContent, String resContent) {
        builder.buildRequest(reqContent, resContent);
    }

    public void buildCustomer(String firstName, String lastName, String phone, String email) {
        builder.buildCustomer(firstName, lastName, phone, email);
    }

    public void buildAgent(String id, Address address) {
        builder.buildAgent(id, address);
    }

    public void buildConclusion(boolean isAnswered, boolean needCallBack) {
        builder.buildConclusion(isAnswered, needCallBack);
    }

    public Request getRequest() {
        return builder.getRequest();
    }

}
