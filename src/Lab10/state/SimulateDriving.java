/*
 * Created on Jan 23, 2018
 */
package Lab10.state;


public class SimulateDriving {
    private State regularState;
    private State gravelState;
    private State wetState;
    private State iceState;
    private State state = regularState;


    public SimulateDriving() {
        regularState = new RegularState(this);
        gravelState = new GravelState(this);
        wetState = new WetState(this);
        iceState = new IceState(this);
    }

    public State getRegularState() {
        return regularState;
    }

    public void setRegularState(State regularState) {
        this.regularState = regularState;
    }

    public State getGravelState() {
        return gravelState;
    }

    public void setGravelState(State gravelState) {
        this.gravelState = gravelState;
    }

    public State getWetState() {
        return wetState;
    }

    public void setWetState(State wetState) {
        this.wetState = wetState;
    }

    public State getIceState() {
        return iceState;
    }

    public void setIceState(State iceState) {
        this.iceState = iceState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doLeft() {
        state.left();
    }

    public void doAccel() {
        state.accel();
    }

    public void doRight() {
        state.right();
    }

    public void doBrake() {
        state.brake();
    }

}
