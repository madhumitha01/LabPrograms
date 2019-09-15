#include<stdio.h>
#include<conio.h>
int a,b,u,v,i,j,min,mincost=0,ne=1,n;
int visited[10]={0},cost[10][10];
void main()
{
	printf("Enter the no. of nodes:");
	scanf("%d",&n);
	printf("Enter the adjacency matrix:\n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			scanf("%d",&cost[i][j]);
			if(cost[i][j]==0)
			cost[i][j]=999;
		}
		
	}
	visited[1]=1;
	while(ne<n)
	{
	for(i=1,min=999;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(cost[i][j]<min)
			if(visited[i]==1)
			{
				min=cost[i][j];
				a=u=i;
				b=v=j;
			}
		}
	}
	if(visited[a]==0 || visited[b]==0)
	{
		printf("Edge %d:(%d-%d)=%d\n",ne++,a,b,min);
		mincost+=min;
		visited[b]=1;
	}
	cost[a][b]=cost[b][a]=999;
	}
	printf("Minimum cost:%d",mincost);
	getch();
}
