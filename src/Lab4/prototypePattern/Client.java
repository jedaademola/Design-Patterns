package Lab4.prototypePattern;

public class Client {

    public static void main(String[] args) {

        CloneFactory factory = new CloneFactory();

        Employee[] list = new Employee[] { new Employee(111, "1", "1", "1", "1", "1", "1"), };

        Employee s = new Employee(222, "2", "2", "2", "2", "2", "2");

        Employee e = new Employee(333, "Lukman", "Arogundade", "3", "3", "3", "3");
        e.setSupervisor(s);
        e.setStaff(list);

        Employee clonedEmp = null;
        try {
            clonedEmp = (Employee)factory.getClone(e);
        } catch (CloneNotSupportedException e1) {
            e1.printStackTrace();
        }
        System.out.println("-----before making changes----");
        System.out.println(e);
        System.out.println(clonedEmp);

        System.out.println("-------after making changes----");
        clonedEmp.setFirstname("New Name");
        System.out.println(e);
        System.out.println(clonedEmp);
    }

}
