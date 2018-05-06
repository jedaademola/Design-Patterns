/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;


import Lab5.abstractFactory.packCost.Packaging;
import Lab5.abstractFactory.type.PackagingType;

public abstract class PackagingFactory {
    public abstract Packaging getPackaing(PackagingType packType);
}
