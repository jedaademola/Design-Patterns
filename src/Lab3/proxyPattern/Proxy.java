package Lab3.proxyPattern;

public class Proxy implements ITable {

    private Table table = new Table();


    public void addRow(IRow row, int index) {
        table.addRow(row, index);
    }

    public IRow getRow(int rowNum) {
        return table.getRow(rowNum);
    }

    public int numOfRows() {
        return table.numOfRows();
    }

    public void modifyRow(int rowNum, IRow row) {
        IRow r = table.getRow(rowNum);

        synchronized (r) {

            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            r.update(row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        IRow r = table.getRow(rowNum);
        synchronized (r) {
            table.deleteRow(rowNum);
        }
    }

}
