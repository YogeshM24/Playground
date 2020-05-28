

#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c; 
  cin>>r>>c; 
  int a[r][c];
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int q, max=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  {
    int sum=0;
    for(int j=0;j<c;j++)
    {
      sum+=a[i][j];
    }
    if(sum>=max) 
    {
      max=sum;
      q=i+1;
    }
    cout<<sum<<" ";
  }
  cout<<"\nRow "<<q<<" has maximum sum";
  int s, max1=0;
  cout<<"\nSum of columns is ";
  for(int i=0;i<c;i++)
  {
    int sum=0;
    for(int j=0;j<r;j++)
    {
      sum+=a[j][i];
    }
    if(sum>max1)
    {
      max1=sum;
      s=i+1;
    }
    cout<<sum<<" ";
  }
  cout<<"\nColumn "<<s<<" has maximum sum";
  
  
  
  
}