package section3.part1.classes.methodBasics.objects;

public class Product1 {

    int productId = 100; //declaration statement (literal)
    String productName; //it will get the default value of a String variable (which is 'null')

    int newProductId = productId + 1; //declaration statement (expression)

    long supplierPhoneNumber = 555_444_33_22L;
    //You can use underscore to make a numeric value more readable; it would still be printed as a normal value

    void pasteConsole() {
        System.out.println(productId);
        System.out.println(productName);

        System.out.println("productId: " + productId);
        System.out.println("productName: " + productName);

        System.out.println("newProductId: " + newProductId);
        System.out.println("supplierPhoneNumber: " + supplierPhoneNumber);
    }

    public static void main(String [] args) {
        Product1 p = new Product1();
        p.pasteConsole();
    }

}
