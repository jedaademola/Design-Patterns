package Lab4.prototypePattern;

public class CloneFactory {

    public Prototype getClone(Prototype prototype) throws CloneNotSupportedException{
        return prototype.clone();
    }

}
