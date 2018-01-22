package adapterPattern;

public interface TargetQueue {

    public void enQueue(String str);
    public String deQueue();
    public boolean isEmpty();

    public int size();
}
