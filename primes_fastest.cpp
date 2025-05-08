#include <iostream>
#include <cstdlib>
#include <cmath>
#include <vector>

using namespace std;

int main(int argc, char* argv[]) {
    int limit = atoi(argv[1]);
    vector<int> primes;

    for (int n = 2; n <= limit; n++) {
        bool prime = true;
        int root = (int) sqrt(n);

        for (int i = 0; i < primes.size(); i++) {
            int d = primes[i];
            if (d > root) {
                break;
            } else if (n % d == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            primes.push_back(n);
        }
    }

    cout << primes.size() << endl;
    return 0;
}
