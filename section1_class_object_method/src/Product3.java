public class Product3 {

    int productId;
    productId = 300; //assignment statement cannot appear at class body; it has to be in a method

    //it might have been declared this way too^^:
    int nextProductId = 400;

    String productName;
    int supplierId;

    void pasteConsole() {
        System.out.println(productId);

        productName = "coffee"; //assignment statement (all good since it has been declared on method level)
        System.out.println(productName);

        supplierId = "supplier_name" //an int variable has been declared with a String value; it wouldn't work!
        System.out.println(supplierId);
    }

}
