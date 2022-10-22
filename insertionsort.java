import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    static void insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j = i+1; j >0; j--) 
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
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

        System.out.println("enter size of array");
        int n=s.nextInt();

        System.out.println("enter array elements");
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        s.close();
    }
    
}
