package Lab8.builder;

import java.util.UUID;


public class RequestBuilder implements IRequestBuilder {
    Call call;
    Request request;

    public RequestBuilder(Call call) {
        request = new Request();
    }

    @Override
    public void buildRequest(String reqContent, String resContent) {
        request.setReqId(UUID.randomUUID().toString());
        request.setReqContent(reqContent);
        request.setRespContent(resContent);

    }

    @Override
    public void buildCustomer(String firstName, String lastName, String phone, String email) {
        Customer cus = new Customer(firstName, lastName, phone, email);
        request.setRequester(cus);
    }

    @Override
    public void buildConclusion(boolean isAnswered, boolean needCallBack) {
        request.setAnswered(isAnswered);
        request.setNeedCallBack(needCallBack);
    }

    @Override
    public void buildAgent(String id, Address address) {
        Agent agent = new Agent(id, address);
        request.setAgent(agent);
    }

    @Override
    public Request getRequest() {
        return request;
    }

}
