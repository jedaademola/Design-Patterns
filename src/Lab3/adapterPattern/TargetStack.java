package Lab3.adapterPattern;

public interface TargetStack {

    public void push(String str);
    public String pop();
    public boolean isEmpty();

    public int size();
}
