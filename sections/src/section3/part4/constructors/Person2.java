package section3.part4.constructors;

public class Person2 {
    int id;

    Person2(int newId) {
        id = newId;
    }

    Person2 p2 = new Person2(1001);
    //TO DO: Remove comment block for errored code!
    //Person2 p2 = new Person2(); //illegal unless you provide a no-args constructor as well
}
