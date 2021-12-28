package section3.part4.constructors;

public class Person8 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;
    boolean international;

    //2nd constructor (the one we overload with 'this'):

    /*
    MUST be the first statement
    Only one-per-constructor
    No recursive invocation
    No instance variables as arguments
    */

    Person8(int newId, String newName, String newGender, int newAge, long newPhone) {
        this(newId, newName, newGender, newAge, newPhone, false);
        //We used 'this' to invoke the primary constructor^^
    }

    //Primary constructor:
    Person8(int newId, String newName, String newGender, int newAge, long newPhone, boolean isInternational) {
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        international = isInternational;

        int nextId = id + 1;

        System.out.println("\nid: " + id);
        System.out.println("\nname: " + name);
        System.out.println("\ngender: " + gender);
        System.out.println("\nid:age " + age);
        System.out.println("\nid:phone " + phone);
        System.out.println("\nid:newId " + nextId);
        System.out.println("\nid:isInternational " + isInternational);

    }

    public static void main(String[] args) {
        Person8 p8First = new Person8(2000, "Angelica", "Female", 18, 538_222_33_44L, true);
        Person8 p8Second = new Person8(1000, "John", "Male", 15, 538_111_22_33L);
    }
}
