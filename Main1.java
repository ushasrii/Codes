#include <stdio.h>

int main()
{
    int n,t,i,j;
    scanf("%d%d",&n,&t);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j] == t)
            {
                printf("%d %d",i,j);
            }
        }
    }
    return 0;
}