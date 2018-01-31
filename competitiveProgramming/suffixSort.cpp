#include <iostream>
#include <algorithm>
#include <cstring>

using namespace std;
//create a suffix strutcure. define a suffix
struct suffix
{
	char *suff;//suffix ptr
};

int y(struct suffix l, struct suffix m)
{
	return strcmp(l.suff,b.suff)<0?1:0;
}

void buildTheArray(char *str,int k)
{
	int e = strlen(str);
	struct suffix array[e];
	for(int i = 0; i < e; i++)
	{
		array[i].suff = (str + i);
	}
	sort(array, array + e, cmp);
	cout<<array[k-1].suff;
}

int main()
{
	char str[66];
	int k;
	cin>>str>>k;
	buildTheArray(str, k);
	
}