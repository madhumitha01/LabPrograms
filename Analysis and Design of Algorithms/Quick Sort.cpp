#include<stdio.h>
#include<conio.h>

void quick(int a[100],int l,int h)
{
	int i=l,p=l,j=h,temp;
	if(l<h)
	{
		while(i<j)
		{
			while(a[p]>a[i] && i<=h)
				i++;
			while(a[p]<a[j] && j>=l)
				j--;
				
			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			temp=a[p];
			a[p]=a[j];
			a[j]=temp;
			
			quick(a,l,j-1);
			quick(a,j+1,h);
	}
}

int main()
{
	int i,j,a[100],n;
	printf("Enter no of element : ");
	scanf("%d",&n);
	printf("Enter the array : ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	
	quick(a,0,n-1);
	
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);
	return 0;
}
