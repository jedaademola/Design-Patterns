/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;


public class Flight {
    private final int ticketPrice = 300;
    private final int flightBudget = 5000;
    private int numPassenger = 0;


    public Flight(int numPassenger) {
        this.numPassenger = numPassenger;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int n) {
        numPassenger = n;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getFlightBudget() {
        return flightBudget;
    }

    public int getFirstClassPrice() {
        return ticketPrice * 4;
    }

    public int getBusinessPrice() {
        return (int) (ticketPrice * 1.5);
    }

    public int getCoachPrice() {
        return (int) (ticketPrice * 0.75);
    }
}
