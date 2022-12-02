#include<stdio.h>
#include<conio.h>
int getmax(int arr[],int s,int e)
    {
        int max=s;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;   
            }
        }
        return max;
    }
void main()
{
    int n=5;int i;int inti,a[5];
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    inti=getmax(a,0,n);
    printf("%d",inti);
    getch();
}