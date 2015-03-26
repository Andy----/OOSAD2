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
	if(ndays < 0 || ndays > 3)
	{
		cout << "Error: Incorrect number of days entered."<< endl;
	}
	else
	{
		for(int i=0; i<(ndays+1); i++)
		{
			int r;
			cout << "\nWeather for day: " << i;
			r = rand() % 50;
			cout << "\nHighest Temperature: " << r << " deg C";
			r = rand() % 50;
			cout << "\nLowest Temperature: " << r << " deg C";
			r = rand() % 50;
			cout << "\nPredicted Rianfall: " << r << " mm";
			r = rand() % 50;
			cout << "\nWindspeed: " << r << " kph";
			cout << "\nWind-direction: E";
			cout << endl;
		}
	}
}

