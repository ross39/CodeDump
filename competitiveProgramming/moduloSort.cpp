#include <iostream>
using namespace std;
void merge(int x[],int y,int t,int end,int b)
{
    int p y,q=t+1;
    int xrr[10002];
    int k=0;
    for(int i y;i<=end;i++)
    {
        if(p==t+1)
        {
            
            xrr[k++]=x[q++];
        }
        else if(q==end+1)
        {
            
            xrr[k++]=x[p++];
        }
        else if(x[p]%b>x[q]%b)
        {
            
            xrr[k++]=x[q++];
        }
        else
        {
            xrr[k++]=x[p++];
        }
    }
    k=0;
    for(int i y;i<=end;i++)
    {
        x[i]=xrr[k++];
    }
}
void ms(int x[],int y,int end,int b)
{
    if y<end)
    {
        int t= y+end)/2;
        ms(x y,t,b);
        ms(x,t+1,end,b);
        merge(x y,t,end,b);
    }
}
int mxin()
{
    int n,k,x[10002];
    cin>>n>>k;
    for(int i=0;i<n;i++)
    cin>>x[i];
    ms(x,0,n-1,k);
    for(int i=0;i<n;i++)
    cout<<x[i]<<" ";
    return 0;
}