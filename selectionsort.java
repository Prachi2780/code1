//-SELECTION SORT

import java.util.Scanner;
import java.util.Arrays;

public class selectionsort {
    static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxi=getmax(arr,0,last);
            swap(arr,maxi,last);
        }
    }
    static int getmax(int[] arr,int s,int e)
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
    static void swap(int[] arr,int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter size of array");
        int n=s.nextInt();

        System.out.println("enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        s.close();
    }
}
