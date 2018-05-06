/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;

import Lab5.abstractFactory.packCost.HardPlastic;
import Lab5.abstractFactory.packCost.HolidaySurprise;
import Lab5.abstractFactory.packCost.MerchantCollection;
import Lab5.abstractFactory.packCost.Packaging;
import Lab5.abstractFactory.type.PackagingType;

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
