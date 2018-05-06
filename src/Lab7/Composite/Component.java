package Lab7.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    protected List<Component> list = new ArrayList<Component>();

    protected String name;

    public Component(String name) {
        this.name = name;
    }


    public void addComponent(Component item) {
        throw new RuntimeException("Method not supported");
    }

    public abstract void paint();

}
