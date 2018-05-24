package FineCalculator;

public class FacultyVisitorCharges implements Visitor {
    private double totalCharges = 0.0;

    @Override
    public void visit(Book book) {

        if (book.getCharges() < 5)
            totalCharges += 0.10 * book.getNoOfDays();
    }

    @Override
    public void visit(Magazine magazine) {
        if (magazine.getCharges() < 5)
            totalCharges += 0.05 * magazine.getNoOfDays();
    }

    @Override
    public void visit(ResearchPaper researchPaper) {

        if (researchPaper.getCharges() < 5)
            totalCharges += 0.00 * researchPaper.getNoOfDays();
    }

    public double getTotalCharges() {
        return totalCharges;
    }
}
