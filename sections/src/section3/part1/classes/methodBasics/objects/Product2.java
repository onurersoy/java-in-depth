package section3.part1.classes.methodBasics.objects;

public class Product2 {

    int productId; //variables need to be in class body if we want them to get a default value
    int supplierId;

    void pasteConsole() {
        System.out.println(productId); //it will print the default value of a int variable (which is '0')

        int newProductId;
        /* TO DO: Remove comment block for errored code!
        System.out.println(newProductId);
        */
        /*
        This variable will get an error during compilation  because it is not in the class body and it
        won't be able to get a default value^^
        */

        String productName = "coffee"; //literal > you can declare a variable in a method (literal or expression, doesn't matter)
        System.out.println(productName);

        int newSupplierId = supplierId + 1; //expression > you can declare a variable in a method (literal or expression, doesn't matter)
        System.out.println(newSupplierId);
    }

    public static void main(String [] args) {
        Product2 p = new Product2();
        p.pasteConsole();
    }
}
