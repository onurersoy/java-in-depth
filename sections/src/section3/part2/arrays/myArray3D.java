package section3.part2.arrays;

public class myArray3D {

     //3D Array:

    /*
    Dimensions higher than 2 dimension are rare in practice (f.e. a data cube) but it is still good to see an example
    of a 3D array
    */

    //1st type of notation (then you have to assign the values/elements of the array in a new line):
    int[][][] myArrayOne3D = new int[4][4][4];

    //2nd type of notation
    int[][][] myArrayTwo3D = new int[][][] {
                                            {
                                                {0,0,0,0},
                                                {0,0,0,0},
                                                {0,0,0,0},
                                                {0,0,0,0}
                                            },
                                            {
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0}
                                            },
                                            {
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0}
                                            },
                                            {
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0},
                                                    {0,0,0,0}
                                            }
    };

    //3rd type of notation
    int[][][] myArrayThree3D = {
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            }
    };

}
