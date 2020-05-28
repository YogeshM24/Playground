
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
  cout<<"Sum of Zig-Zag pattern is ";
  int row, sum=0;
  if(r==3||c==3)
  {
    for(int i=0;i<r;i=i+1)
    {
      row=0;
      for(int j=0;j<c;j++)
      {
        if(i!=1)
          row+=a[i][j];
      }
      sum+=row; 
    }
    cout<<sum+a[1][1];
  }
  else
  {
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        row+=a[i][j];
      }
    }
    cout<<row; 
  }
}