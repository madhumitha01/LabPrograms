#include<stdio.h>
int parent[10];
int uniq(int,int);
int find(int);
void main()
{
	int a[10][10]={0},min,n,ne=1,u,v,b,
	c,min_cost=0,i,j;
	printf("Enter the no. of nodes:");
	scanf("%d",&n);
	printf("Enter the Adjaceny matrix \n");
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			{scanf("%d",&a[i][j]);
			if(a[i][j]==0)
			a[i][j]=999;}
	while(ne<n)
	{
		for(i=1,min=999;i<=n;i++)
			for(j=1;j<=n;j++)
				if(a[i][j]<min)
						{
							min=a[i][j];
							b=u=i;
							c=v=j;
						}
						u=find(u);
						v=find(v);
		if(uniq(u,v))
		{
			printf("\nThe Edge %d has cost %d connecting %d and %d",ne++,min,b,c);
			min_cost+=min;
		}
		a[b][c]=a[c][b]=999;
	}
	printf("\nTotal cost=%d",min_cost);
}
int uniq(int i ,int j)
{
	if(i!=j)
	{parent[i]=j;
	return 1;
}
return 0;
}
int find(int i)
{
	while(parent[i])
	i=parent[i];
	return i;
}
