package section3.part4.constructors;

public class Person7 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;
    boolean international;


    Person7(int newId, String newName, String newGender, int newAge, long newPhone) {
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;

        int nextId = id + 1;

        System.out.println("\nid: " + id);
        System.out.println("\nname: " + name);
        System.out.println("\ngender: " + gender);
        System.out.println("\nid:age " + age);
        System.out.println("\nid:phone " + phone);
        System.out.println("\nid:newId " + nextId);

    }

    //2nd constructor (the one we overload):
    Person7(int newId, String newName, String newGender, int newAge, long newPhone, boolean isInternational) {
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
        Person7 p7First = new Person7(2000, "Angelica", "Female", 18, 538_222_33_44L, true);
        Person7 p7Second = new Person7(1000, "John", "Male", 15, 538_111_22_33L);
    }
}

/*
If we need to modify something, f.e. if we need to make "name" uppercase, we have to modify both of constructors.
Instead of that, we can use a 'this' statement; for that, check the next class "Person8".
*/
