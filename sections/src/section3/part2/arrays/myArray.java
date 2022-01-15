package section3.part2.arrays;

public class myArray {

    //2D Array:

    //int[] myArray1 = array of int
    //int[][] myArray1 = array of array of int

    //1st type of notation (then you have to assign the values/elements of the array in a new line):
    int[][] myArray1 = new int[4][2];
    //4 = rows
    //2 = columns
    //It can be visualize like this: myArray = [0[0] [0][1], [1][0] [1][1], [2][0] [2][1], [3][0] [3][1]

    //2nd type of notation:
    int[][] myArray2 = new int[][] {
            {9,11},
            {2,5},
            {4,4},
            {6,13}
    };

    //3rd type of notation:
    int[][] myArray3 = {
            {9,11},
            {2,5},
            {4,4},
            {6,13}
    };

    /*
    Length in arrays:
    myArray.length; = 4 (number of rows)
    myArray[0].lenght = 2 (there are two columns in the first row)
    (check "myArray" array above for reference^^)
    */

}
