#include<iostream>
#include<string>

using namespace std;

int main()
{
	string str;
	int c, m;
	cin>>str;
	for(int i = 0; i < str.length(); i++)
	{
		if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
		{
			c++;
		if(c > m)
		{
			m = c;
		}
		}else
	    {
			c = 0;
	    }
	 }
}

	cout<< m << endl;
	return 0;
}