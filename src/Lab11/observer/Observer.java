/*
 * Created on Jan 25, 2018
 */
package Lab11.observer;


public abstract class Observer {
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
