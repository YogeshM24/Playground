#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, l; 
  std::cin>>r>>l; 
  if(l==2*r)
    std::cout<<"circle can be inside a square ";
  else
    std::cout<<"circle cannot be inside a square ";
}