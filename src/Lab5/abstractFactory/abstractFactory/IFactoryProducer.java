/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory.abstractFactory;


import Lab5.abstractFactory.PackagingFactory;
import Lab5.abstractFactory.type.PackType;

public interface IFactoryProducer {
    public PackagingFactory getFactory(PackType packType);

}
