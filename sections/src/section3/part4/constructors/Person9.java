package section3.part4.constructors;

public class Person9 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;
    boolean international;

    Person9(int newId, String newName, String newGender, int newAge, long newPhone) {
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

    Person9(int newId, String newName, String newGender, int newAge, long newPhone, boolean isInternational) {
        this(newId, newName, newGender, newAge, newPhone);
        international = isInternational;

        int nextId = id + 1;
    }

    public static void main(String[] args) {
        Person9 p9First = new Person9(2000, "Angelica", "Female", 18, 538_222_33_44L, true);
        Person9 p9Second = new Person9(1000, "John", "Male", 15, 538_111_22_33L);
    }
}
