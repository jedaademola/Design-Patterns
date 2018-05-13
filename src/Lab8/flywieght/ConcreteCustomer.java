package Lab8.flywieght;

public class ConcreteCustomer implements CustomerLogger {
    //city map with a red dot representing residence location
    private Image locationMap;

    public ConcreteCustomer(City city) {
        locationMap = new Image(city);
    }

    @Override
    public void logCustomerInfo(String cutomerId, String firstName, String lastName) {
        System.out.println("Cutomer details::cutomerId" + cutomerId + " firstName::" + firstName + " lastName::" + lastName);

    }
}
