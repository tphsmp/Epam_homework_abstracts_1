package StoreProj;

public class Main {

    public static void main(String[] args) {

        Item crayon = new Item("Fantasy Color", 98, "parcr00697", "Eisenstifel GMbH");
        Item eraser = new Item ("Elephant", 200, "parer00078", "Rubber Man Inc.");
        Item pen = new Item ("Endpoint Line", 110, "parpn 5550917", "Inked Dudes");

        OfficeSuppliesShop kGoods = new OfficeSuppliesShop();

        kGoods.add(crayon);
        kGoods.add(eraser);
        kGoods.add(pen);

        kGoods.printAllProducts();

        kGoods.sell(pen);
        System.out.println("The item is sold \n");

        kGoods.printAllProducts();



    }

}
