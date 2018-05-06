package Lab6.ChainOfResponsability.model;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode="
                + zipcode + "]";
    }


}