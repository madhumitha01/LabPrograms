#include<stdio.h>
int a[10][10],n,visited[100],n,i,j;
void dfs(int v)
{   int i=0;
	visited[v]=1;
	for(i=1;i<=n;i++)
   {
	 if(a[v][i] && !visited[i])
      {
	   printf("%d->%d \n",v,i);
       dfs(i);
      }
   }
   
	
}
int main()
{  int v,count=0;
  printf("Enter the number of nodes :\n");
  scanf("%d",&n);
  
  for(i=1;i<=n;i++)
  { visited[i]=0;
    for(j=1;j<=n;j++)
  	 {
  	   
  	   a[i][j]=0;
     }
}
  printf("Enter the adjacency matrix:\n");
  for(i=1;i<=n;i++)
  {
  	for(j=1;j<=n;j++)
  	{
  		scanf("%d",&a[i][j]);
	}
  }
  printf("Enter the starting vertex :\n");
  scanf("%d",&v);
  dfs(v);
  for(i=1;i<=n;i++)
  {
  	if(visited[i])
  	count++;
  }
  
  if(count==n)
  printf("All vertices visited \n");
  else printf("All vertices are not visited \n");
	
	return 0;
}
