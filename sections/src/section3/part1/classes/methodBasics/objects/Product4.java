package section3.part1.classes.methodBasics.objects;

public class Product4 {

    //We can declare two variables in the same row
    int productId = 543, supplierId = 876;

    int brandId = 100, nextBrandId = brandId + 10;

    int price1; //price1 gets integer's default value
    int price2 = price1 = 20; //price1 is re-assigned here; its value is '20' now, same as price2

    /* TO DO: Remove comment block for errored code!
    int price4 = price3 = 20;
    //This instance would get a compilation error because price3 isn't declared
     */

}
