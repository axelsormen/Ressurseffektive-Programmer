import java.util.HashMap;
import java.util.Map;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Person){
            Person p = (Person) other;
            return name.equals(p.name) && age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return name.hashCode() * 17 + age; // Multiply by any prime number
    }
}

public class HashMaps {
    public static void main(String[] args) {
        Map<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(new Person("Axel Ørmen", 25), 20000);
        hashMap.put(new Person("Ludvig Ørmen", 22), 28000);
        hashMap.put(new Person("Felix Ørmen", 19), 18000);

        for (Map.Entry<Person, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().getName()+" ["+entry.getKey().getAge()+" years] has the hash value: " + entry.hashCode());
        }
    }
}