/*
 * Created on Jan 23, 2018
 */
package Lab10.state;


public class GravelState implements State {
    SimulateDriving simulateDriving;
    // we declare this in some cases we need to change state after one action

    public GravelState(SimulateDriving driving) {
        this.simulateDriving = driving;
    }

    @Override
    public void left() {
        System.out.println("Gravel effect is 3");
//        simulateDriving.setState(simulateDriving.getWetState());
    }

    @Override
    public void accel() {
        System.out.println("Gravel effect is 7");
    }

    @Override
    public void right() {
        System.out.println("Gravel effect is 3");
    }

    @Override
    public void brake() {
        System.out.println("Gravel effect is 6");
    }

}
