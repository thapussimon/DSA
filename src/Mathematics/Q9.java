package Mathematics;

import java.util.Scanner;

public class Q9 {
    //Print the divisors of a number
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        print(num);
        System.out.println();
        printDivisors(num);
        System.out.println();
        printDivisorsOptimized(num);

    }
    public static void printDivisorsOptimized(int n){
        int i;
        for (i=1;i*i<n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }

        }
        for (;i>=1;i--){
            if (n%i==0){
                System.out.print((n/i)+" ");

            }

        }
    }

    //Naive Method To print the Divisors of a Number
    public static void print(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0)
                System.out.print(i+" ");
        }
    }

    //Efficient Solution
    //Here The divisors wont be in a sorted order
    //The divisors appear in pairs
    //There would be an element from every pair till square root(n)
    public static void printDivisors(int n){
        //By using the concept of the pair of divisors
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
                //This step is used for corner case when it is a perfect square
                //When it is a perfect square we do not need to print the number twice
                //Initially printing 1 divisor in every pair then by using n/i print the rest divisor
                //This would not be in sorted order
                if (i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }

}
