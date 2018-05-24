package FineCalculator;

import java.util.ArrayList;
import java.util.List;

public class OverdueFines {

    private List<LibrayItem> items;

    public double calculateStduentCharges() {
// create a visitor
        StudentVisitorCharges visitor = new StudentVisitorCharges();
// iterate through all items
        items = new ArrayList<>();

        for (LibrayItem item : items) {
            item.accept(visitor);
        }
        double totalStudentCharges = visitor.getTotalCharges();
        return totalStudentCharges;
    }

    public double calculateFacultyCharges() {
// create a visitor
        FacultyVisitorCharges visitor = new FacultyVisitorCharges();
// iterate through all items

        items = new ArrayList<>();

        for (LibrayItem item : items) {
            item.accept(visitor);
        }
        double totalFacultyCharges = visitor.getTotalCharges();
        return totalFacultyCharges;
    }
}
