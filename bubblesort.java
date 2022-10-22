//--BUBBLE SORT

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort
{
    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j< arr.length-i;j++)
            {
                if (arr[j-1]>arr[j])
                {
                    swap(arr,j,j-1);
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

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); 
        s.close();
    }
   
}
