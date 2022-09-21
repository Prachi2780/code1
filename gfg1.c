// search linearly for an element in array using recursion
#include<stdio.h>
#include<conio.h>
int search(int arr[],int n,int target)
{
    if(n<0)
    {
        return 0;
    }
    if(arr[n]==target)
    {
        return 1;
    }
    return search(arr,n-1,target);
}
int main()
{
    int n,target,i,k,arr[100];
    printf("enter the target and size of array\n");
    scanf("%d %d",&target,&n);
    printf("enter the array\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    k=search(arr,n,target);
    printf("%d\n",k);
    printf(k==0?"not present":"present");
    
}