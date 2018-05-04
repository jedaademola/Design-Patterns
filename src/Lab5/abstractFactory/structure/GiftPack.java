/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory.structure;

import java.util.ArrayList;
import java.util.List;

import mum.asd.abstractfactory.type.PackType;

public class GiftPack {
    private List<GiftItem> giftItems = new ArrayList<GiftItem>();
    private Address shippingAddress;
    private PackType packType;

    public GiftPack() {

    }

    public GiftPack(Address shippingAddress, PackType packType) {
        super();
        this.shippingAddress = shippingAddress;
        this.packType = packType;
    }


    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void setGiftItems(List<GiftItem> giftItems) {
        this.giftItems = giftItems;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PackType getPackType() {
        return packType;
    }

    public void setPackType(PackType packType) {
        this.packType = packType;
    }


}
