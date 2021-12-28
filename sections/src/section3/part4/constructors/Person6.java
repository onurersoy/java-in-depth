package section3.part4.constructors;

public class Person6 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;


    Person6(int newId, String newName, String newGender, int newAge, long newPhone) {
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

    public static void main(String[] args) {
        Person6 p6 = new Person6(1000, "John", "Male", 15, 538_111_22_33L);

    }

}
