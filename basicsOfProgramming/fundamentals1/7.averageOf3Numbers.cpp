#include <iostream>
using namespace std;

int main()
{
  int a, b, c;
  int average;
  cout << "Type a number: ";
  cin >> a;
  cout << "Type another number: ";
  cin >> b;
  cout << "Type another number: ";
  cin >> c;
  average = (a+b+c)/3; 
  cout << "Average is: " << average << endl;
}