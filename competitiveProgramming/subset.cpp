//Given an array of non-negative integers. Our task is to find minimum number of elements such that their sum should be greater than the sum of rest of the elements of the array.
#include <bits/stdc++.h>
#include <string.h>
using namespace std;

//our approach is to find the largest element and sort the array in decending order
//we will then take elements from the largest until we get strictly moe than half
//of the total sum of the given array

int min_element(int arr[], int n)
{
	//calculate half of the array sum
	int halfSum = 0;
	for(int i = 0; i < n; i++)
		halfSum+= arr[i];
	halfSum/= 2;

	//sort the array in decending order
	sort(arr, arr + n, greater<int>());

	int res = 0 ,current_sum = 0;

	for(int i = 0; i < n; i++)
	{
		current_sum += arr[i];

		//elements greater than sum
		if(current_sum > halfSum)
		{
			res++;
			return res;
		}
	}
	return res;
}

int main()
{
	int arr[] ={4,6,7,4,3,5,5,6,3,2,2,4,77,7,7,5,24254,23,4234234234,232};
	int n = sizeof(arr) / sizeof(arr[0]);
	cout << min_element(arr,n) << endl;
	return 0;
}

