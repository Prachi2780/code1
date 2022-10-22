//--BINARY SEARCH


import java.util.Scanner;

public class binarysearch {
    static int search(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        boolean isasc=arr[s]<arr[e];
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isasc)
            {
                    if(target<arr[mid])
                    {
                        e=mid-1;
                    }
                    else
                    {
                        s=mid+1;
                    }
            }
            else
            {
                    if(target>arr[mid])
                    {
                        e=mid-1;
                    }
                    else
                    {
                        s=mid+1;
                    }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int k;
        System.out.println("enter size of array");
        int n=s.nextInt();

        System.out.println("enter target element");
        int target=s.nextInt();
        
        System.out.println("enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        k=search(arr,target);
        System.out.println(k);
        s.close();
        }
}
