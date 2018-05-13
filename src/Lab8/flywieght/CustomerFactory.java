package Lab8.flywieght;

public class CustomerFactory {

    static ConcreteCustomer byCity[] = new ConcreteCustomer[6];

    static {
        byCity[0] = new ConcreteCustomer(City.Fairfield);
        byCity[1] = new ConcreteCustomer(City.Grinnel);
        byCity[2] = new ConcreteCustomer(City.MountPlesant);
        byCity[3] = new ConcreteCustomer(City.Ottumwa);
        byCity[4] = new ConcreteCustomer(City.CedarRapid);
    }

    public static ConcreteCustomer getCustomer(City city) {
        int i = Math.abs(city.hashCode() % 5);
        ConcreteCustomer concreteCustomer = byCity[i];
        return concreteCustomer;
    }

}
