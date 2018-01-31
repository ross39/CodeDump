#include<iostream>
#include<fstream>
#include<string>
#include<vector>
using namespace std;

int main()
{

	ifstream File;
	File.open("index.tx");
	std::vector<int>numbers;
	int number;
	while(File >> number)
		numbers.push_back(number);

}
