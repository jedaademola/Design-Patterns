package FineCalculator;

public class Book implements LibrayItem {
    private double charges;
    private int noOfDays;
    //accept the visitor


    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
