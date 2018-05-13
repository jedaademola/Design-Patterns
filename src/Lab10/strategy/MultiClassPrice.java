/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;

import java.util.List;


public class MultiClassPrice implements Model {

    @Override
    public int getRevenue(List<Flight> flights) {
        int price = 0;
        for (Flight flight : flights) {
            int fistClass = flight.getNumPassenger() / 10;
            int firstClassPrice = fistClass * flight.getTicketPrice() * 4;
            int business = flight.getNumPassenger() * 1 / 5;
            int businessPrice = business * flight.getBusinessPrice();
            int coach = flight.getNumPassenger() * 7 / 10;
            int coachPrice = coach * flight.getCoachPrice();
            price += firstClassPrice + businessPrice + coachPrice - (flight.getFlightBudget() * 1.2);
        }
        return price;
    }

}
