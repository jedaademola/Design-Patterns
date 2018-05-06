package Lab7.Composite;

public class Composite extends Component {


    public Composite() {
        super(null);
    }

    public Composite(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component item) {
        list.add(item);
    }

    @Override
    public void paint() {
        if (name == null) {
            return;
        }

        System.out.println(name);

        for (Component component : list) {
            component.paint();
        }

        System.out.println(new StringBuilder(name).insert(1, "/"));

    }
}
