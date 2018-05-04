/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;

import mum.asd.abstractfactory.packaging.HardPlastic;
import mum.asd.abstractfactory.packaging.HolidaySurprise;
import mum.asd.abstractfactory.packaging.MerchantCollection;
import mum.asd.abstractfactory.packaging.Packaging;
import mum.asd.abstractfactory.type.PackagingType;

public class BusinessFactory extends PackagingFactory {

    @Override
    public Packaging getPackaing(PackagingType packType) {
        switch (packType) {
            case Bag:
                return new MerchantCollection();
            case Box:
                return new HardPlastic();
            case Wrap:
                return new HolidaySurprise();
            default:
                return null;
        }
    }

}
