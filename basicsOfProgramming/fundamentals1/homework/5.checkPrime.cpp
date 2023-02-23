#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Type a number: ";
  cin >> n;
  int div = 2;
  for (int i = 2; i < n; i++) {
    if (i==n) continue;
    if (n%i == 0) {
      cout << "not prime" << endl;
      return 0;
    }
  }
  cout << n << " is a prime number" << endl;
}