#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Type a number: ";
  cin >> n;
  for (int i = 1; i <= n; i = i + 2) {
    cout << i << endl;
  }
}