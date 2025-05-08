#include <iostream>
using namespace std;

int main() {
    long long value = 2000000000;
    long long* pointer = &value; 
    long long** pointerToPointer = &pointer;

    cout << "Value: " << value << endl;

    cout << "Address to value: " << pointer << endl;

    cout << "Address to pointer: " << pointerToPointer << endl;

    cout << "This should give the same values: " << value << " and " << *pointer << " and " << **pointerToPointer << endl;

    return 0;
}