#include <iostream>
#include "firstlib.h"
using namespace std;
int main()
{
printGreeting();

int numDays;
cout << "Enter the number of days: " << endl;
cin >> numDays;
weatherForecast(numDays);
return 0;
}
