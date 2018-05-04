/*
 * Created on Jan 18, 2018
 */
package Lab5.abstractFactory.structure;

import mum.asd.abstractfactory.packaging.Packaging;
import mum.asd.abstractfactory.type.PackagingType;

public class GiftItem {
    private String giftId;
    private String giftName;
    private String description;
    private PackagingType packagingType; // "bag", "box", or "wrap".
    private Packaging packaging;

    public GiftItem(String giftId, String giftName, String description) {
        super();
        this.giftId = giftId;
        this.giftName = giftName;
        this.description = description;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }
}
