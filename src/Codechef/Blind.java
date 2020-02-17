package Codechef;

import java.util.Arrays;
import java.util.Scanner;
class Blind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long arr1[] = new long[n];
            long s=0;
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = sc.nextLong();
            }
            for(int i=0;i<arr.length;i++)
            {
                arr1[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            Arrays.sort(arr1);
            for(int i=0;i<arr.length;i++)
            {
                s = s+Math.min(arr[i],arr1[i]);
            }
            System.out.println(s);
        }
    }
}
