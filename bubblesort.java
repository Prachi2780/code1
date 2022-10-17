//WAP to bubble sort an array.

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        System.out.println("enter  array");
        int[] arr=new int[n];
        for(int i=0;i< n;i++)
        {
            arr[i]=s.nextInt();
        }
        sort(arr);
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arr[i]);
//        };
        System.out.println(Arrays.toString(arr)); 
        // s.close();
    }
    static void sort(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length-1;i++)
        {
            swapped=false;
            for(int j=0;j< arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    static void swap(int[] arr,int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
