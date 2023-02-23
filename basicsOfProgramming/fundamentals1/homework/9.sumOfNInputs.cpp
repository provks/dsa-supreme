#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Type a number: ";
  cin >> n;
  int sum = 0;
  for (int i = 1; i <= n; i++) {
    int input;
    cout << "Enter input number: ";
    cin >> input;
    sum += input;
  }
  cout << sum << endl;
}