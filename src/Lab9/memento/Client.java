/*
 * Created on Jan 23, 2018
 */
package Lab9.memento;


public class Client {
    //    private static Originator orginator = new Originator();
    private static Caretaker careTaker = new Caretaker();

    public static void main(String arg[]) {
        String text;
        String text1 = "Hi All";
        save(text1);
        String text2 = "Hi All there";
        save(text2);
        text2 = "Hi All over";
        System.out.println("text2 before " + text2);
        text = undo();
        System.out.println("text2 after undo " + text);
    }

//    public static String load(String text) {
//        
//    }

    public static String undo() {
        Memento memento = careTaker.get();
        if (memento != null) {
            return memento.getState();
        }
        return "";
    }

    public static void save(String state) {
        Originator originator = new Originator();
        originator.setOrginatedState(state);
        careTaker.add(originator.saveToMemento());
    }
}
