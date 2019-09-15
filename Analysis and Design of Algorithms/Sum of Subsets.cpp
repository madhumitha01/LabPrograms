#include<stdio.h>
#define true 1
#define false 0
int SubsetSum(int arr[], int n, int sum, int subset[], int count)
{
	int i;
	if (sum == 0)
	{
		printf("\n");
		for(i =0; i < count; i++)
		printf("%d ", subset[i]);
		return true;
	}
	if(n < 0 && sum != 0)
		return false;
	
	subset[count] = arr[n];
	
	return   SubsetSum(arr, n-1, sum-arr[n], subset, count + 1) + 
	    SubsetSum(arr, n-1, sum, subset, count );
}


int main()
{
	int set[100],n,i,sum;
	int subset[100];
	
	printf("Enter no. of elements\n");
	scanf("%d",&n);
	
	printf("Enter the set in increasing order\n");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&set[i]);
	}
	
	printf("Enter the sum\n");
	scanf("%d",&sum);
	SubsetSum(set, n, sum, subset,0);
}

