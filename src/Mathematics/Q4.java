package Mathematics;

import java.util.Scanner;

public class Q4 {
    //The Question is to Find the number of trailing zeros in the factorial of a number
    //I have implemented an efficient and a brute force technique
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("The number of trailing zeros in the factorial is "+count(n));//Brute Force Technique
        System.out.println("The number of trailing zeros in the factorial is "+countZeros(n));//Logarithmic Solution
    }
    //Brute Force Solution

    public static int count(int n){
        int fact=1;
        int res=0;
        //I am calculating the factorial of a number here
        for (int i=2;i<=n;i++){
            fact*=i;
        }
        //I am calculating whether the factorial have trailing zeros here
        while (fact%10==0){
            res++;
            fact/=10;
        }

        return res;
    }

    //Efficient Solution-Log Solution
    public static int countZeros(int n){
        int res=0;
        for (int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }











}
