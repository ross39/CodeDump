#include <iostream>
#include <vector>
#include <string.h>
using namespace std;

struct T
{
	char x[11];
};

int main()
{
	vector<T> a;
	T t;
	int n, i, count, j ,k;

	cin>>n;
	for(i = 0; i < n; i++)
	{
		cin >>t.x;
		a.push_back(t);
	}

	cout<< '0' << "\n";
	for(i = 1; i < n; i++)
	{
		count = 0; k  =i;
		for(j = k; j > 0; j--)
		{
			if(strcmp(a[k].x,a[j-1].x) > 0)
				count++;
		}
		cout<< count << "\n";
	}

	return 0;

}