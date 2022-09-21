//wap to check if there exist 2 numbers in an array whose sum is x

#include<stdio.h>

int main()
{
    int target,arr[100],n,c=0;
    printf("enter the size of array\n");
    scanf("%d",&n);
    printf("enter the target sum\n");
    scanf("%d",&target);
    printf("enter the array\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }    
    for (int i = 0; i < n; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            if(arr[i]+arr[j]==target)
            {
                printf("%d %d",arr[i],arr[j]);
                c++;
            }
        }  
    }
    if(c==0)
    {
        printf("no such pair exists\n");
    }
    return 0;
}