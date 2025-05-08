#include <iostream>
using namespace std;

void recurse(int x){
    cout << x << endl;
    recurse(x + 1);
}

int main() {
    recurse(0);
    return 0;
}