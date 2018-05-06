package Lab7.Composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void paint() {
        System.out.println("\t" + name);
    }


}
