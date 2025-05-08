import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Print {
    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        print("Hello, generics!");
        print(42);
        print(3.14);
        print(true);

        ArrayList<Object> list = new ArrayList<Object>();

        Person p = new Person("Axel", 25);

        list.add(23);        // Integer
        list.add("Hei");     // String
        list.add(p);
        System.out.println(list);  // Prints the list
    }
}
