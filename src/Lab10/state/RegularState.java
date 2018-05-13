/*
 * Created on Jan 23, 2018
 */
package Lab10.state;


public class RegularState implements State {

    SimulateDriving simulateDriving;

    // we declare this in some cases we need to change state after one action
    public RegularState(SimulateDriving driving) {
        this.simulateDriving = driving;
    }

    @Override
    public void left() {
        System.out.println("Regular effect is 5");
    }

    @Override
    public void accel() {
        System.out.println("Regular effect is 9");
    }

    @Override
    public void right() {
        System.out.println("Regular effect is 5");
    }

    @Override
    public void brake() {
        System.out.println("Regular effect is 8");
    }

}
