package Codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Covid19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int c=1;
            ArrayList a = new ArrayList();
            for(int i=0;i<n-1;i++)
            {
                if(arr[i+1] -arr[i] <=2)
                    c=c+1;
                else
                {
                    a.add(c);
                    c=1;
                }
            }
            a.add(c);
            if(a.size() == 1)
                System.out.println(a.get(0) + " " + a.get(0));
            else {
                Collections.sort(a);
                System.out.println(a.get(0) + " " + a.get(a.size() - 1));
            }
        }
    }
}