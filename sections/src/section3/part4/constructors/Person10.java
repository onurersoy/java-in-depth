package section3.part4.constructors;

public class Person10 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;
    boolean international;

    Person10(int id, String name, String gender, int age, long phone) {
        this(id, name, gender, age, phone,false);
    }

    Person10(int id, String name, String gender, int age, long phone, boolean international) {
        /*
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        international = isInternational;
         */

        /*
        1. Instead of each time coming with new naming ideas for variables (such as 'newPhone'),
            we can use 'this' reference.
        2. We could not use it like "id = id;", because we would equal exactly the same 'id's to each other.
            The "id" of our constructor wouldn't linked with the "id" of instance variable.
         */

        //Let's refactor:
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.international = international;

        int nextId = id + 1;

        System.out.println("\nid: " + this.id);
        System.out.println("\nname: " + this.name);
        System.out.println("\ngender: " + this.gender);
        System.out.println("\nid:age " + this.age);
        System.out.println("\nid:phone " + this.phone);
        System.out.println("\nid:newId " + nextId);
        System.out.println("\nid:isInternational " + this.international);

    }

    public static void main(String[] args) {
        Person10 person1 = new Person10(2000, "Angelica", "Female", 18, 538_222_33_44L, true);
        Person10 person2 = new Person10(1000, "John", "Male", 15, 538_111_22_33L);
    }
}
