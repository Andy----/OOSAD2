/*
* g++ -c firstlib.cpp -o firstlib.o
* ar rcs libFirstLib.a firstlib.o
* g++ main.cpp -L. -lFirstLib -o main
* ./main
*/
#include <iostream>
#include "firstlib.h"
#include <cstdlib>
using namespace std;
void printGreeting()
{
cout << "Welcome to C++ Library Programming" << endl;
}

void weatherForecast(int ndays)
{
	if(ndays < 1 || ndays > 3)
	{
		cout << "Error: Incorrect number of days entered.";
	}
	else
	{
		for(int i=0; i<ndays; i++)
		{
			int r= rand() % 10;
			cout << "\nWeather for day: " << (i+1)
			<< "\nHighest Temperature: " << r << " deg C"
			<< "\nLowest Temperature: " << r << " deg C"
			<< "\nPredicted Rianfall: " << r << " mm"
			<< "\nWindspeed: " << r << " kph"
			<< "\nWind-direction: E"
			<< endl;
		}
	}
}

