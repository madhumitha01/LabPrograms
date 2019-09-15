#include<stdio.h>
 int count,n,f=0,r=-1,q[20],visited[20];
 void bfs(int g[20][20],int v);
 void BFS(int g[20][20]);
 void BFS(int g[20][20])
 {
 int v;
 count=0;
 for(v=0;v<n-1;v++)
 visited[v]=0;
 for(v=0;v<=n-1;v++)
 {
 if(visited[v]==0)
 bfs(g,v);
 }
 }
 void bfs(int g[20][20], int v)
 {
 int count=0,u;
 count=count+1;
 visited[v]=count;
 q[++r]=v;
 while(f<=r)
 {
 for(u=0;u<n-1;u++)
 {
 if(g[v][u]!=0 && visited[u]==0)
 {
 count=count+1;
 visited[u]=count;
 q[++r]=u;
 }
 }
 printf("\n%d",q[f++]);
 }
 }

 int main()
 {
 int g[20][20],i,j;
 printf("enter the number of vertices");
 scanf("%d",&n);
 printf("enter the adjacency matrix\n");
 for(i=0;i<n;i++)
 {
 for(j=0;j<n;j++)
 {
 scanf("%d",&g[i][j]);
 }
 printf("\n");
 }
 BFS(g);
 return 0;
}
