package Lab3.proxyPattern;

public interface ITable {

    public int numOfRows();

    public IRow getRow(int rowNum);

    public void addRow(IRow row, int rowNum); //add row at the end

    public void modifyRow(int rowNum, IRow row);

    public void deleteRow(int rowNum);

}
