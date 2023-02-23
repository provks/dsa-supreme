#include <iostream>
using namespace std;

int main() {
  int a,b,c;
  cout << "Length of side1";
  cin >> a;
  cout << "Length of side2";
  cin >> b;
  cout << "Length of side3";
  cin >> c;
  if (a+b > c && b+c > a && c+a > b)
    cout << "Valid trianlge" << endl;
  else
    cout << "Invalid trianlge" << endl;
}