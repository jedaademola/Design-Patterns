package Lab4.templateMethod;

public abstract class Alphabet{
    public final void showAlphabet(char[][] alpha){
        char symmetryType = findAlphabet(alpha);
        char[][] recAlpha=reconstructAlphabet(alpha, symmetryType);
        printAlphabet(recAlpha);
    }

    public abstract char findAlphabet(char[][] alpha);
    public abstract char[][] reconstructAlphabet(char[][] alpha, char symmetryType);
    public abstract void printAlphabet(char[][] alpha);
}

