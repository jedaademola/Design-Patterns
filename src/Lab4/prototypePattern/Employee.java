package Lab4.prototypePattern;

import java.io.*;

public class Employee implements Prototype, Serializable {
    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    public Employee(int id, String Lastname, String Firstname, String streetAddress, String city, String state, String zipcode) {
        this.id = id;
        this.Lastname =Lastname;
        this.Firstname = Firstname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String getFirstname() {
        return Firstname;
    }
    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
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
    public Employee getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
    public Employee[] getStaff() {
        return staff;
    }
    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);
            oos.flush();
            oos.close();
            bos.close();
            byte[] byteData = bos.toByteArray();

            // restoring class from a stream of bytes
            ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
            return (Employee) new ObjectInputStream(bais).readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                oos.close();
                bos.close();
            } catch (IOException ioe) {
                System.out.println("IOException in ObjectCloner = " + ioe);
            }
        }
    }
    @Override
    public String toString() {
        return Firstname+" "+Lastname;
    }
}

