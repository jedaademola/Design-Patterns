/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String arg[]) {
        Flight flight1 = new Flight(500);
        Flight flight2 = new Flight(600);
        Flight flight3 = new Flight(700);
        Flight flight4 = new Flight(800);
        Flight flight5 = new Flight(900);
        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        Model singlePrice = new SinglePrice();
        Model twoClasses = new TwoClassesPrice();
        Model multiClasses = new MultiClassPrice();

        System.out.println("Single Price : " + StrategyContext.getInstance(singlePrice).getRevenue(flights));
        System.out.println("MultiClasses Price : " + StrategyContext.getInstance(multiClasses).getRevenue(flights));
        System.out.println("Two Classese Price : " + StrategyContext.getInstance(twoClasses).getRevenue(flights));
    }

}
