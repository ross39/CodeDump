//a program to find the first n odd numbers
#include<iostream>
using namespace std;

//returns the sum of the first
//n odd numbers

//okish 
int oddSum1(int n)
{
	int sum = 0; int current = 0;
	for(int i = 0; i < n; i++)
	{
		sum += current;
		current += 2;
	}
	return sum;
}

int oddSum2(int n)
{
	return(n * n);
}

int main()
{
	int n = 40;
	cout << "sum of first" << n
		<< "odd numbers is"<< oddSum2(n);
	return 0;
}
