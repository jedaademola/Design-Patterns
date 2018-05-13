/*
 * Created on Jan 25, 2018
 */
package Lab11.observer;


public class Client {

    public static void main(String arg[]) {
        Subject subject = new Subject();
        Observer nameObserver = new NameObserver(subject);
        subject.attache(nameObserver);
        subject.addName("Lukman");
        subject.addName("Hawwa");
        subject.addName("Farhan");
        subject.addName("Farah");
        subject.removeName("Matilda");
    }
}
