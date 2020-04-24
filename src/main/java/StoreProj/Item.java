package StoreProj;

import lesson.AbstractProduct;

public class Item extends AbstractProduct {

    private String catNumber;
    private String manufacturer;

    public Item (String name, double price, String catNumber, String manufacturer) {
        super(name, price);
        this.catNumber = catNumber;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Item{" +  "name='" + getName() + '\'' + ", price='" + getPrice() + '\'' + " Catalogue number " + catNumber +
                " Mnaufacturer " + manufacturer + "\n" +'}';
    }
}
