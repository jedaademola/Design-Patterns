/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;


import Lab5.abstractFactory.packCost.EverydayValue;
import Lab5.abstractFactory.packCost.Packaging;
import Lab5.abstractFactory.packCost.PlainPaper;
import Lab5.abstractFactory.packCost.ReusableShopper;
import Lab5.abstractFactory.type.PackagingType;

public class AdultFactory extends PackagingFactory {

    @Override
    public Packaging getPackaing(PackagingType packType) {
        switch (packType) {
            case Bag:
                return new ReusableShopper();
            case Box:
                return new PlainPaper();
            case Wrap:
                return new EverydayValue();
            default:
                return null;
        }
    }

}
