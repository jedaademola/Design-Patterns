/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;

import java.util.List;


public class TwoClassesPrice implements Model {

    @Override
    public int getRevenue(List<Flight> flights) {
        int price = 0;
        for (Flight flight : flights) {
            int numberBusinessClass = flight.getNumPassenger() / 3;
            int numberCoach = flight.getNumPassenger() * 2 / 3;
            int priceBusiness = numberBusinessClass * flight.getBusinessPrice();
            int priceCoach = numberCoach * flight.getTicketPrice() * flight.getCoachPrice();
            int priceCost = (int) (flight.getFlightBudget() * 1.1);
            price += priceBusiness + priceCoach - priceCost;
        }
        return price;
    }

}
