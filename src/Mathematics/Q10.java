package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

import static Mathematics.Q7.isPrime;

public class Q10 {
    //Print all prime numbers less than or equal to the given number
    //Sieve Of Eratosthenes is the most efficient way to do this problem
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
//        printPrime(num);// Naive Method
        sieve(num);
        System.out.println();
        sieveOptimized(num);

    }
    //This is a Naive Solution
    //isprime is a function created to check for prime numbers
    //I have imported the isPrime function for Q7
    public static void printPrime(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }



    //Sieve Algorithm
    //This is a simple sieve implementation
    public static void sieve(int n){
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,2,n+1,true);
        for (int i=2;i<=n;i++){
            if (arr[i]){
                for (int j=2*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i])
                System.out.print(i+" ");
        }
    }

    //Optimized Sieve Algorithm
    public static void sieveOptimized(int n){
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,2,n+1,true);
        for (int i=2;i*i<=n;i++){
            if (arr[i]){
                for (int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i])
                System.out.print(i+" ");
        }
    }


























}
