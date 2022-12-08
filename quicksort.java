import java.util.*;
import java.util.ArrayList;


public class quicksort 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void sort(int[] nums,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];
        while(s<=e)
        {
            while(nums[s]<pivot)
            {
                s++;
            }
            while(nums[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
