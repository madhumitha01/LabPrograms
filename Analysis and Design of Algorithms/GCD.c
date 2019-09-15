#include<stdio.h>
int main()
{ int a,b,c;
printf("enter the two numbers\n");
scanf("%d%d",&a,&b);
while(b!=a)
 { if(a>b)
 	a=a-b;
   else
 	b=b-a;
 }
 printf("the GCD is %d\n",a);
 return 0;
}   
