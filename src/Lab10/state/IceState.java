/*
 * Created on Jan 23, 2018
 */
package Lab10.state;


public class IceState implements State {
    SimulateDriving simulateDriving;
    // we declare this in some cases we need to change state after one action

    public IceState(SimulateDriving driving) {
        this.simulateDriving = driving;
    }

    @Override
    public void left() {
        System.out.println("Ice effect is 1");
    }

    @Override
    public void accel() {
        System.out.println("Ice effect is 3");
    }

    @Override
    public void right() {
        System.out.println("Ice effect is 1");
    }

    @Override
    public void brake() {
        System.out.println("Ice effect is 2");
    }

}
