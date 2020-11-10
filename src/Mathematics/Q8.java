package Mathematics;

import java.util.Scanner;

public class Q8 {
    //Find Prime Factors of a number
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
//        printPrimeFactors(n);//Optimized Solution
        primeFactors(n);//Efficent SOlution

    }

    //This is an Efficient Implementation
    public static void primeFactors(int n){
        if (n<=1)
            return;
        for (int i=2;i*i<=n;i++){
            while (n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        //This is for corner Case Checking when i*i would not be less than n
        if (n>1){
            System.out.print(n);
        }
    }


    //This is an optimized solution
    public static void printPrimeFactors(int n){
        //For 1 and numbers less no prime factors
        if (n<=1)
            return;
        //Checking for 2's factors
        while (n%2==0){
            System.out.print("2 ");
            n/=2;
        }
        //Checking for 3's Factors
        while (n%3==0){
            System.out.print("3 ");
            n=n/3;
        }
        //checking for the rest numbers
        for (int i=5;i*i<=n;i++){
            while (n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while (n%(i+2)==0){
                System.out.print((i+2));
                n/=(i+2);
            }
        }
        //This condition is for corner case checking
        //when i*i would not be less than n
        if (n>3){
            System.out.println(n);

        }




    }
}
