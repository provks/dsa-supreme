#include <iostream>
using namespace std;

// Check whether the given number is even or odd? (learning conditionals)
int main()
{
  int marks;
  bool isEven;
  cout << "Type marks obtained: ";
  cin >> marks;
  if (marks >= 90) {
    cout << "A";
  } else if (marks >= 80){
    cout << "B";
  } else if (marks >= 60){
    cout << "C";
  } else if (marks >= 50){
    cout << "D";
  } else if (marks >= 40){
    cout << "E";
  } else {
    cout << "F";
  }
  cout << endl;
}
