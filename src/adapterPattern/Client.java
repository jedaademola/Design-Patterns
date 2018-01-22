package adapterPattern;

public class Client {

    public static void main(String args[]) {

       // String[] data = {};//{"cat","dog","cow"};
        TargetStack tStack = new Adapter(10);
        System.out.println("tStack length:" + tStack.size());
        System.out.println("tStack.isEmpty():" + tStack.isEmpty());
        tStack.push("cook");
        System.out.println("tStack length:" + tStack.size());


    }
}
