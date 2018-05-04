/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory.abstractFactory;


import Lab5.abstractFactory.AdultFactory;
import Lab5.abstractFactory.BusinessFactory;
import Lab5.abstractFactory.KidFactory;
import Lab5.abstractFactory.PackagingFactory;
import Lab5.abstractFactory.type.PackType;

public class FactoryProducer implements IFactoryProducer {
    public static FactoryProducer INSTANCE;

    private FactoryProducer() {

    }

    public static FactoryProducer getInstance() {
        if (INSTANCE == null)
            INSTANCE = new FactoryProducer();
        return INSTANCE;
    }

    @Override
    public PackagingFactory getFactory(PackType packType) {
        switch (packType) {
            case Business:
                return new BusinessFactory();
            case Adults:
                return new AdultFactory();
            case Kids:
                return new KidFactory();
            default:
                return null;
        }
    }
}
