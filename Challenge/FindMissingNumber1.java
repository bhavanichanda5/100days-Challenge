package Challenge;

import java.util.Scanner;

// ============== LeetCode - 268. Missing Number ==============

public class FindMissingNumber1 {

    public static int missingNum(int[] arr, int n){

        int expectedNum =  n * (n + 1) / 2;
        int num = 0;

        for (int i : arr){
            num = num + i;
        }

        return  expectedNum - num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array - ");                                 //n = 6
        int n = sc.nextInt();

        int[] arr = new int[n];                         //2 1 4 0 5 6

        System.out.print("Enter Elements - ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements - ");

        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\nMissing Number is - "+missingNum(arr, n));
    }
}
