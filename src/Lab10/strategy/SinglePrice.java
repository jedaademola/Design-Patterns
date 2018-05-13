/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;

import java.util.List;


public class SinglePrice implements Model {

    @Override
    public int getRevenue(List<Flight> flights) {
        int price = 0;
        for (Flight flight : flights) {
            price += (flight.getNumPassenger() * flight.getTicketPrice()) - flight.getFlightBudget();
        }
        return price;
    }

}
