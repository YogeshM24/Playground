#include<stdio.h>
int main(){
  int n,i,sum;
  int min,max;

  printf("");
  scanf("%d",&min);

  printf("");
  scanf("%d",&max);

  printf("");
  for(n=min;n<=max;n++){
    i=1;
    sum = 0;

    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }

    if(sum==n)
      printf("%d ",n);
  }

  return 0;
}