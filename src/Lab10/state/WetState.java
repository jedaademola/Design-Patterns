/*
 * Created on Jan 23, 2018
 */
package Lab10.state;


public class WetState implements State {

    SimulateDriving simulateDriving;
    // we declare this in some cases we need to change state after one action

    public WetState(SimulateDriving driving) {
        this.simulateDriving = driving;
    }

    @Override
    public void left() {
        System.out.println("Wet effect is 4");
//        simulateDriving.setState(simulateDriving.getIceState());
    }

    @Override
    public void accel() {
        System.out.println("Wet effect is 9");
    }

    @Override
    public void right() {
        System.out.println("Wet effect is 4");
    }

    @Override
    public void brake() {
        System.out.println("Wet effect is 7");
    }

}
