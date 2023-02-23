#include <iostream>
using namespace std;

int main() {
  int a,b,c;
  cout << "Type a number: ";
  cin >> a;
  cout << "Type a number: ";
  cin >> b;
  cout << "Type a number: ";
  cin >> c;

  if (a > b && a > c) {
    cout << a << endl;
    return 0;
  }
  if (b > a && b > c) {
    cout << b << endl;
    return 0;
  } else {
    cout << c << endl;
  }
}