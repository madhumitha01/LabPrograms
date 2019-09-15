 #include<stdio.h>
 int main()
 {
 int n,i,prime[100],j;
 printf("Enter the value of n\n");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
 prime[i]=1;
 }
 prime[0]=0;
 prime[1]=1;
 for(i=2;i<n;i++)
 {
 if(prime[i]==1)
 {
 for(j=2;i*j<n;j++)
 {
 prime[i*j]=0;
 }
 }
 }
 printf("The prime numbers are\n");
 for(i=0;i<n;i++)
 {
 if(prime[i]==1)
 {
 printf("\n%d",i);
 }
 }
 return 0;
 }
