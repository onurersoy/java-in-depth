public class Product5 {

    int x = 100;
    long y = x; //Implicit Casting (widening conversion)

    long b = 45;
    int a = (int) b; //Explicit Casting (narrowing conversion)

        /*Information Loss in Explicit Casting:
            > Truncation: Floating-point to integer/char will always truncate
        */
            int z = (int) 3.14f;
            //z = 3 (result)
}
