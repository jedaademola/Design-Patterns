package adapterPattern;

public class Adapter implements TargetStack,TargetQueue {

    private Adaptee adaptee;

    public Adapter(int sizeArr)
    {
        // we need reference to the object we
        // are adapting
       // this.adaptee = adaptee;
        adaptee = new Adaptee(sizeArr);
    }

    @Override
    public void push(String str) {
        adaptee.add(str);
    }


    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public void enQueue(String str) {
        adaptee.add(str);
    }

    @Override
    public String deQueue() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    @Override
    public int size() {
        return adaptee.size();
    }
}
