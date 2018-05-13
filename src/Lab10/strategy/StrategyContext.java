/*
 * Created on Jan 23, 2018
 */
package Lab10.strategy;

import java.util.List;

public class StrategyContext {

    private static StrategyContext INSTANCE;
    private Model model;

    private StrategyContext(Model model) {
        this.model = model;
    }

    public static StrategyContext getInstance(Model model) {
        if (INSTANCE == null)
            return new StrategyContext(model);
        return INSTANCE;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getRevenue(List<Flight> flights) {
        return model.getRevenue(flights);
    }

}
