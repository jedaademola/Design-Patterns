package Lab3.proxyPattern;

public class Row implements IRow {

    private String data;

    public Row(String data) {
        this.data = data;
    }

    @Override
    public String get() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public void update(IRow row) {
        this.data = row.get();
    }

}
