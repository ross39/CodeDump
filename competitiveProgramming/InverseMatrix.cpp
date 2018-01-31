#include <iostream>
using namespace std;

int main()
{
	std::ios::sync_with_stdio(false);
	int f;
	cin>>f;
	while(f--)
	{
		int n;
		cin>>n;
		int arr[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				cin>>arr[i][j];
			}
		}
		int a = 0; 
		for(int y = 0; y < n; y++)
		{
			for(int l = 0; l < n; l++)
			{
				for(int i = n-1; i >= y; i--)
				{
					for(int j = n-1; j>=l; j--)
					{
						if(arr[y][l]>arr[i][j])
							a++;
					}
				}
			}
		}
		cout<<a<<endl;
	}
	return 0;
}