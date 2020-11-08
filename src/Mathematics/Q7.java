package Mathematics;

import java.util.Scanner;

public class Q7 {
    //Check for a Number is a Prime or not
    // I have implemented three solutions here
    //The function returns a boolean value if a number is prime or not
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
//        System.out.println(isPrime(num));
        System.out.println(isPrimeMoreEfficient(num));
    }


    //This is an efficient algorithm
    //This reduces the time complexity from O(n) to O(squareroot(n))
    //The below is the concept that I have used in the loop section
    //Divisors always appears in pairs
    //suppose n is the number
    //x & y are its divisors
    //x*y<=n
    //And if x<=y
    //x*x<=n
    //x<=square root(n)
    public static boolean isPrimeEfficient(int n){
        if (n==1)
            return false;
        for (int i=2;i*i<=n;i++)
            if (n%i==0)
                return false;
        return true;
    }

    //This is a more efficient algorithm
    //This is to check for large values

    public static boolean isPrimeMoreEfficient(int n){
        if (n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n%2==0 || n%3==0)
            return false;
        //skipping the factors of two and three
        //It reduces the time complexity by threefold
        for (int i=5;i*i<=n;i+=6)
            if (n%i==0 || n%(i+2)==0)
                return false;
        return true;
        }



    //This is a naive solution to check for prime
    //Not The best in terms of time complexity
    public static boolean isPrime(int n){
        if (n==1)
            return false;
        for (int i=2;i<n;i++)
            if (n%i==0)
                return false;
        return true;
    }
}
