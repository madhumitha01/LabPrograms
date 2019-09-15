#include<stdio.h>
int min(int x,int y)
{
	if(x<y)
	return x;
	else return y;
}
void floyd(int a[40][40],int n)
{ int k,i,j;
  
  for(k=1;k<=n;k++)
 { for(i=1;i<=n;i++)
   { for(j=1;j<=n;j++)
     { a[i][j]=min(a[i][j],(a[i][k]+a[k][j]));
     }
   }
 }
 
 for(i=1;i<=n;i++)
  { for(j=1;j<=n;j++)
   {
   	 printf("%d \t",a[i][j]);
   }
    printf("\n");
  }
}

int main()
{   int a[40][40],i,j,n;
    printf("Enter size :\n");
    scanf("%d",&n);
    printf("Enter adjacency matrix \n");
    for(i=1;i<=n;i++)
    { for(j=1;j<=n;j++)
      { scanf("%d",&a[i][j]);
      }
    }
    floyd(a,n);
	return 0;
}
