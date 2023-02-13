#include <iostream>
using namespace std;

// Check whether the given number is even or odd? (learning conditionals)
int main()
{
  int a;
  bool isEven;
  cout << "Type a number: ";
  cin >> a;
  isEven = a % 2 == 0; 
  if (isEven) {
    cout << a << " is even" << endl;
  } else {
    cout << a << " is odd" << endl;
  }
}