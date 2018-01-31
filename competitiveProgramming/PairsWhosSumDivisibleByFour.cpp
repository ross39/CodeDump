#include<bits/stdc++.h>
using namespace std;

//using modulos 
int countDivisbleByFour(int arr[], int n)
{
	//make a frequency array to store the variables
	int freq[4] = {0,0,0,0};

	//we must now count all the occurrences of the remainder
	for(int i = 0; i < n; i++)
		++freq[arr[i] % 4];

	//if both pairs are divisble by 4
	int ans = freq[0] * (freq[0] -1 ] / 2);

	//if both pairs are 2 modulo 4
	ans += freq[2] * (freq[2] - 1) / 2);

	//if one is equal to 1 mod 4
	//if one is equal to 3 mod 4

	ans += freq[1] * freq[3]; 
	
}

int main()
{
	int arr[] = {2,2,1,7,5};
	int n = sizeof(arr) / sizeof(arr[0]);


	cout<< countDivisbleByFour(arr,n);
	return 0;

}
