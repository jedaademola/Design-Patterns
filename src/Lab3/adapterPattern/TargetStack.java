package Lab3.adapterPattern;

public interface TargetStack {

    void push(String str);

    String pop();

    boolean isEmpty();

    int size();
}
