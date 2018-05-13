/*
 * Created on Jan 23, 2018
 */
package Lab9.memento;


public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


}
