import java.util.function.Supplier;

public class FactoryPattern {
    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return "%s (%d years)".formatted(name, age);
        }
    }

    public static class ExtensibleList<T> {
        private Object[] elements;
        private int size;
        private final Supplier<T> factory;

        public ExtensibleList(Supplier<T> factory) {
            this.elements = new Object[2];
            this.size = 0;
            this.factory = factory;
        }

        public void addNew() {
            if (size >= elements.length) {
                Object[] newArray = new Object[elements.length * 2];
                System.arraycopy(elements, 0, newArray, 0, elements.length);
                elements = newArray;
            }
            elements[size++] = factory.get();
        }

        public void printAll() {
            for (int i = 0; i < size; i++) {
                System.out.println(elements[i]);
            }
        }
    }

    public static void main(String[] args) {
        ExtensibleList<Person> list = new ExtensibleList<>(() -> new Person("Newborn", 0));
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.addNew();
        list.printAll();
    }
}
