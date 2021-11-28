package section3.part1.classes.methodBasics.objects;

public class Product6 {

    int productId;
    int supplierId;

    void pasteConsole() {
        System.out.println(productId);
        System.out.println(supplierId);
    }

    public static void main(String [] args) {
        Product6 product6 = new Product6();
        product6.productId = 50;
        product6.supplierId = 100;
        product6.pasteConsole();
    }

}
