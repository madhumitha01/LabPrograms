#include<stdio.h>
#include<conio.h>

int n,g[10][10],dist[10]={999},visited[10]={0},i,j,en=1,min,min_index=0,index;

int min_distance_in_dist_array(int dist[10],int visited[10])
{
	for(i=1,min=999;i<=n;i++)
	{
		if(visited[i]==0 && dist[i]<min)
		{
			min=dist[i];
			min_index=i;
		}
	}
	return(min_index);
}

void dij(int g[10][10],int source)
{
	//int index;
	dist[source]=0;
	while(en<n)
	{
		index=min_distance_in_dist_array(dist,visited);
		
		visited[index]=1;
		
		for(i=1;i<=n;i++)
		{
			if(visited[i]==0 && g[index][i]!=0 && dist[index]!=999 && (g[index][i]+dist[index]<dist[i]))
				dist[i]=g[index][i]+dist[index];
		}
		en++;
	}
	for(i=1;i<=n;i++)
	{
		printf("\nMinDistance from %d to %d  is : %d",source,i,dist[i]);
	}
}


int main()
{
	printf("Enter no of node : ");
	scanf("%d",&n);
	printf("Enter the cost matrix: ");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			scanf("%d",&g[i][j]);
		}
	}
	for(i=1;i<=n;i++)
	{
		dist[i]=999;
		visited[i]=0;
	}	
	dij(g,1);
	return 0;
}
