package section3.part1.classes.methodBasics.objects;

public class Product3 {

    int productId;
    /* TO DO: Remove comment block for errored code!
    productId = 300;
    */
    //Assignment statement cannot appear at class body; it has to be in a method^^

    //It might have been declared this way too^^:
    int nextProductId = 400;

    String productName;
    int supplierId;

    void pasteConsole() {
        System.out.println(productId);

        productName = "coffee"; //assignment statement (all good since it has been declared on method level)
        System.out.println(productName);

        int productCount; //assignment statement (we could both declare and assign on method level as well)
        productCount = 5;
        System.out.println(productCount);

        /* TO DO: Remove comment block for errored code!
        supplierId = "supplier_name"
        //An int variable has been declared with a String value; it wouldn't work!^^
        System.out.println(supplierId);
        */
    }

}
