/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;

import mum.asd.abstractfactory.packaging.Cartoon;
import mum.asd.abstractfactory.packaging.HappyKid;
import mum.asd.abstractfactory.packaging.Micky;
import mum.asd.abstractfactory.packaging.Packaging;
import mum.asd.abstractfactory.type.PackagingType;

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
