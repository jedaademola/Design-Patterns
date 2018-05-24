package FineCalculator;

public class StudentVisitorCharges implements Visitor {
    private double totalCharges = 0.0;

    @Override
    public void visit(Book book) {
        if (book.getCharges() < 10)
            totalCharges += 0.10 * book.getNoOfDays();
    }

    @Override
    public void visit(Magazine magazine) {
        if (magazine.getCharges() < 10)
            totalCharges += 0.10 * magazine.getNoOfDays();
    }

    @Override
    public void visit(ResearchPaper researchPaper) {
        if (researchPaper.getCharges() < 10)
            totalCharges += 0.20 * researchPaper.getNoOfDays();
    }

    public double getTotalCharges() {
        return totalCharges;
    }
}
