package Lab4.templateMethod;


public abstract class TemplateClass {
    public final void printLetter(String fileName) {
        String[] fileContent = readFile(fileName);
        String[] reconstruct = reconstructLetter(fileContent);
        print(reconstruct);
    }


    public abstract String[] readFile(String fileName);

    public abstract String[] reconstructLetter(String[] fileContent);

    public abstract void print(String[] reconstruct);
}
