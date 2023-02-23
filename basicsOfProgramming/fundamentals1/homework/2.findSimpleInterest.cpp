#include <iostream>
using namespace std;

int main() {
  int P,R,T;
  cout << "Type Principal Amount: ";
  cin >> P; 
  cout << "Type Interest Rate: ";
  cin >> R;
  cout << "Type Time in Years: ";
  cin >> T;
  int SI = (P*R*T)/100;
  cout << "Simple Interest is: " << SI << endl;
}