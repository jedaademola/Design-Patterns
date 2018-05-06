package Lab4.templateMethod;

public class Client {
    public static void main(String[] args) {
        TemplateMethodClass t = new ProcessPrint();
        t.printLetter("src/Lab4/templateMethod/A.txt");
        System.out.println();
        System.out.println();
        t.printLetter("src/Lab4/templateMethod/B.txt");
        System.out.println();
        System.out.println();
        t.printLetter("src/Lab4/templateMethod/C.txt");
    }
}
