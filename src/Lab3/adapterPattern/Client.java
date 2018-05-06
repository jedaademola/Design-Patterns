package Lab3.adapterPattern;

public class Client {

    public static void main(String args[]) {

       // String[] data = {};//{"cat","dog","cow"};

        System.out.println("Stack");
        System.out.println("-----------------------------");
        TargetStack tStack = new Adapter(10);
        System.out.println("Stack length:" + tStack.size());
        System.out.println("Stack.isEmpty():" + tStack.isEmpty());
        tStack.push("cook");
        tStack.push("fry");

        System.out.println("Stack length before pop:" + tStack.size());
        String popData = tStack.pop();
        System.out.println("Stack Pop data:" + popData);
        System.out.println("Stack length after pop:" + tStack.size());

        System.out.println("-----------------------------");
        System.out.println("Queue");
        System.out.println("-----------------------------");
        TargetQueue qQueue = new Adapter(10);
        System.out.println("Queue length:" + tStack.size());
        System.out.println("Queue.isEmpty():" + tStack.isEmpty());
        qQueue.enQueue("boil");
        qQueue.enQueue("eat");
        System.out.println("Queue length before dequeue:" + qQueue.size());
        String data = qQueue.deQueue();

        System.out.println("Queue data dequeue:" + data);
        System.out.println("Queue length after deQueue:" + qQueue.size());
    }
}
