#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,m,n;
	char a[100],b[100];
	printf("Enter the main string:");
	gets(a);
	printf("Enter the sub string:");
	gets(b);
	m=strlen(a);
	n=strlen(b);
	for(i=0;i<m-n;i++)
	{
		j=0;
		while(b[j]==a[i+j]&& j<n)
		{
			j=j+1;
		}
		if(j==n)
		{
			printf("String found at %d",i+1);
			break;
		}
	}
	if(j!=n)
	{
		printf("String not found");
	}
	getch();
}
