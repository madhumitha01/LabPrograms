#include<stdio.h>
#include<conio.h>

int n,g[10][10],inedge[10],visited[10],en=1,i,j;

void topo(int g[10][10],int n)
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			inedge[i]+=g[j][i];
		}
	}
	
	while(en<n)
	{
		for(i=0;i<n;i++)
		{
			if(inedge[i]==0 && !visited[i])
			{
				printf("%d\t",i);
				visited[i]=1;
				for(j=0;j<n;j++)
				{
					if(g[i][j])
					inedge[j]--;
				}
				en++;
			}
			
		}
		//en++;
	}
}


int main()
{
	printf("Enter no of node : ");
	scanf("%d",&n);
	printf("Enter the adjacency matrix :\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&g[i][j]);
		}
	}
	
	topo(g,n);
	return 0;
}
