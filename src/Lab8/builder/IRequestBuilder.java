package Lab8.builder;

public interface IRequestBuilder {
    public void buildRequest(String reqContent, String resContent);

    public void buildCustomer(String firstName, String lastName, String phone, String email);

    public void buildAgent(String id, Address address);

    public void buildConclusion(boolean isAnswered, boolean needCallBack);

    public Request getRequest();
}
