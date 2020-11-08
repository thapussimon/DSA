package Mathematics;

import java.util.Scanner;

public class Q5 {
    //Find the GCD or Greatest Common Divisor of two numbers
    //I have implemented three solutions using euclids algo & a naive method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("The GCD of "+a+" & "+b+" is "+gcdOptimized(a,b));//Optimized Euclids Algorithm
        System.out.println("The GCD of "+a+" & "+b+" is "+gcdBasicEuclid(a,b));//Basic Euclids Algo
        System.out.println("The GCD of "+a+" & "+b+" is "+gcd(a,b));//Naive solution

    }
    //Naive solution
    public static int gcd(int a,int b){
        int res=Math.min(a,b);
        while (res>0){
            if (a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }


    //Basic Euclidian algorithm using repeated subtraction
    public static int gcdBasicEuclid(int a,int b){
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    //Optimized Euclidean Algorithm
    public static int gcdOptimized(int a,int b){
        if (b==0)
            return a;
        return gcdOptimized(b,a%b);
    }
}
