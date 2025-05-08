public class BuilderPattern {
    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        @Override
        public String toString(){
            return "%s (%d years)".formatted(name, age);
        }
    }

    public static class PersonBuilder{
        private String name;
        private int age;
        
        private boolean ageSet;

        public static PersonBuilder create(){
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(int age){
            this.age = age;
            this.ageSet = true;
            return this;
        }

        public Person build(){
            if(name == null){
                throw new IllegalStateException("Name must be set!");
            }

            if(!ageSet){
                throw new IllegalStateException("Age must be set!");
            }

            return new Person(name, age);
        }
    }

    public static void main(String args[]){
        Person person1 = PersonBuilder.create().withName("Ludvig Ørmen").withAge(22).build();

        PersonBuilder builder = PersonBuilder.create();
        builder.withName("Axel Ørmen");
        builder.withAge(25);
        Person person2 = builder.build();
        
        System.out.println(person1);
        System.out.println(person2);
    }
}