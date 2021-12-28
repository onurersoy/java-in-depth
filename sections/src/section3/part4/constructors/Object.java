package section3.part4.constructors;

public class Object {
    String name;
    int id;

    public static void main(String[] args) {
        Object object1 = new Object();
        object1.name = "Fork";
        object1.id = 123;

        Object object2 = new Object();
        object2.name = "Spoon";
        object2.id = 456;

        Object object3 = new Object();
        object3.name = "Knife";
        object3.id = 789;

        //Reinitializing Object References:
        Object[] objects = {object1, object2, object3};
        //Practice1: Swap the memory addresses of object1 and object3!

        Object temp = objects[0];
        //"temp" holds memory address of original "object1" which is "Fork"
        objects[0] = objects[2];
        //Here, we copy memory address of "object3" and set it to the "object0"; "object0" is "Knife" now
        objects[2] = temp;
        //Here, we are now passing "temp"s memory address (a different 'memory address' comparing to "objects[0]")
        // to "object2"; "object2" is "Fork" now.

        System.out.println("\nName of object1: " + objects[0].name);
        System.out.println("\nName of object2: " + objects[1].name);
        System.out.println("\nName of object3: " + objects[2].name);

        //Refactor1.2:
        Object[] objectsNew = {object1, object2, object3};
        swap(objectsNew, 0, 2);

    }

    //We could do all those above with a method as well
    // Refactor1.1:
    static void swap(Object[] objects, int firstIndex, int secondIndex) {
        Object temp = objects[firstIndex];
        objects[firstIndex] = objects[secondIndex];
        objects[secondIndex] = temp;
        System.out.println("\nName of object1: " + objects[0].name);
        System.out.println("\nName of object2: " + objects[1].name);
        System.out.println("\nName of object3: " + objects[2].name);
    }
}
