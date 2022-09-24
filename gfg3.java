
//WAP to find the majority element in array(appears more than n/2 times)

import java.util.*;
import java.util.HashMap;

public class gfg3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = s.nextInt();
        System.out.println("enter array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //System.out.println("hu");
        major_element(arr);
        s.close();
    }


    static void major_element(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("found " + arr[i]);
                    return;
                } else {
                    map.put(arr[i], count);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        //System.out.println("not found");
    }
}






