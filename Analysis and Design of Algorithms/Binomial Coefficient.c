#include<stdio.h>
int min(int a,int b)
{
	if(a<b)
	return a;
	else return b;
}
int binomial(int n,int k)
{ int i,j;
  int c[100][100];
	for(i=0;i<=n;i++)
	{
		for(j=0;j<=min(i,k);j++)
		{
			if((j==0)||(j==i))
			c[i][j]=1;
			else c[i][j]=c[i-1][j-1]+c[i-1][j];
		}
	}
	return c[n][k];
}
int main()
{  int n,k;
   printf("Enter n and k:");
   scanf("%d%d",&n,&k);
   printf("%dC%d=%d",n,k,binomial(n,k));	
	return 0;
}

