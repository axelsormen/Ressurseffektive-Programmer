#include <iostream>
#include <string>

class Person {
public:
    std::string name;
    int age;
    std::string address;

    Person(std::string name, int age, std::string address) {
        this->name = name;
        this->age = age;
        this->address = address;
    }
};

int main() {
    // Create an instance of Person
    Person p("Alice", 30, "123 Main St");

    // Corrected sizeof usage
    std::cout << "Size of name (String): " << sizeof(p.name) << std::endl;
    std::cout << "Size of age (int): " << sizeof(p.age) << std::endl;
    std::cout << "Size of address (String): " << sizeof(p.address) << std::endl;
    std::cout << "Size of padding & alignment: 4" << std::endl;
    std::cout << "Size of Person class: " << sizeof(Person) << std::endl;

    return 0;
}
