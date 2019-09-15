#include<stdio.h>
#include<conio.h>

void merge(int a[100],int l,int mid,int h)
{
	int temp[100];			//to store sorted array
	int k=l;				//index for temp
	int i=l;				//index for 1st array
	int j=mid+1;			//index for 2nd array
	
	while((i<=mid) && (j<=h))
	{
		if(a[i]<a[j])
			temp[k++]=a[i++];
		else
			temp[k++]=a[j++];
	}
	if(i>mid)				//copy remaining element of 2nd array
	{
		while(j<=h)
			temp[k++]=a[j++];
	}
	else					//copy remaining element of 1st array
	{
		while(i<=mid)
			temp[k++]=a[i++];
	}
	for(i=l;i<=h;i++)		//Coping data to original array
		a[i]=temp[i];	
}

void part(int a[100],int l,int h)
{
	int mid;
	if(l<h)
	{
		mid=(l+h)/2;
		part(a,l,mid);
		part(a,mid+1,h);
		merge(a,l,mid,h);
	}
}

int main()
{
	int i,a[100],n;
	printf("Enter no of element : ");
	scanf("%d",&n);
	printf("Enter the array : ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	
	part(a,0,n-1);
	
	printf("\n\nResult : ");
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);
	return 0;
}
