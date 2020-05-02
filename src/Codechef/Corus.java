package Codechef;
import java.util.Scanner;

class Corus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int arr[] = new int[26];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[s.charAt(j) - 'a'] += 1;
            }
            for(int i=0;i<q;i++) {
                int c = sc.nextInt();
                sum=0;
                for (int k = 0; k < 26; k++) {
                    if (arr[k] > c)
                        sum = sum + arr[k]-c;
                }

                System.out.println(sum);
            }

        }
    }
}
