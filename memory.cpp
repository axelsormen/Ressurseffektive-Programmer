#include <iostream>
#include <string>

using namespace std;

void add(int a, int b, int &sum) {
    sum = a + b;
    int* pointer = &sum;
    cout << "Sum in add() is stored at " << pointer << endl; 
}

int main() {
    int sum;
    int* pointer = &sum;
    cout << "Sum in main() is stored at " << pointer << endl; 
    add(3, 4, sum);
    cout << "Correct sum: " << sum << endl;
}