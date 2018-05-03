package Lab3.adapterPattern;

public interface TargetQueue {

    void enQueue(String str);

    String deQueue();

    boolean isEmpty();

    int size();
}
