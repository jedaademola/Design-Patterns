package Lab3.proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements ITable {

    private List<IRow> rows = new ArrayList<>();

    @Override
    public int numOfRows() {
        return rows.size();
    }

    @Override
    public IRow getRow(int rowNum) {
        return rowNum >= 0 && rowNum < rows.size() ? rows.get(rowNum) : null;
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        rows.add(rowNum, row);
    }

    @Override
    public void deleteRow(int rowNum) {
        rows.remove(rowNum);
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        if (rowNum >= 0 && rowNum < rows.size()) {
            rows.get(rowNum).update(row);
        }
    }

}
