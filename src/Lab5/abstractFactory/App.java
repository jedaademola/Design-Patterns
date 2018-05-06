/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory;


import Lab5.abstractFactory.abstractFactory.FactoryProducer;
import Lab5.abstractFactory.structure.Address;
import Lab5.abstractFactory.structure.GiftItem;
import Lab5.abstractFactory.structure.GiftPack;
import Lab5.abstractFactory.type.PackType;
import Lab5.abstractFactory.type.PackagingType;

public class App {

    public static void main(String[] args) {
        Address address = new Address("1000N 4th street", "", "Fairfied", "Iowa", "52557");
        GiftPack giftPack = new GiftPack(address, PackType.Business);

        GiftItem item1 = new GiftItem("101", "name1", "description1");
        PackagingFactory item1Factory = FactoryProducer.getInstance().getFactory(giftPack.getPackType());

        item1.setPackagingType(PackagingType.Bag);
        item1.setPackaging(item1Factory.getPackaing(item1.getPackagingType()));
        GiftItem item2 = new GiftItem("102", "name2", "description2");
        item2.setPackagingType(PackagingType.Box);
        item2.setPackaging(item1Factory.getPackaing(item2.getPackagingType()));
        GiftItem item3 = new GiftItem("103", "name3", "description3");
        item3.setPackagingType(PackagingType.Wrap);
        item3.setPackaging(item1Factory.getPackaing(item3.getPackagingType()));

        giftPack.getGiftItems().add(item1);
        giftPack.getGiftItems().add(item2);
        giftPack.getGiftItems().add(item3);

        float price = 0;
        for (GiftItem item : giftPack.getGiftItems()) {
            price += item.getPackaging().getCost();
        }
        System.out.println("Total: " + price);
    }

}
