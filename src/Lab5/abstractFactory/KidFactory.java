/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;


import Lab5.abstractFactory.packCost.Cartoon;
import Lab5.abstractFactory.packCost.HappyKid;
import Lab5.abstractFactory.packCost.Micky;
import Lab5.abstractFactory.packCost.Packaging;
import Lab5.abstractFactory.type.PackagingType;

public class KidFactory extends PackagingFactory {

    @Override
    public Packaging getPackaing(PackagingType packType) {
        switch (packType) {
            case Bag:
                return new Micky();
            case Box:
                return new Cartoon();
            case Wrap:
                return new HappyKid();
            default:
                return null;
        }
    }

}
