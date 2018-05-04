/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;

import mum.asd.abstractfactory.packaging.Packaging;
import mum.asd.abstractfactory.type.PackagingType;

public abstract class PackagingFactory {
    public abstract Packaging getPackaing(PackagingType packType);
}
