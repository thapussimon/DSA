package Mathematics;

import java.util.Scanner;

public class Q1 {
    //Count the number of digits
    //I have implemented three solutions for this->iterative,recursive and logarithmic

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       long no=scanner.nextLong();
        System.out.println("The number of digits is "+count(no));//Iterative solution
        System.out.println("The number of digits is "+countRec(no));//Recursive solution
        System.out.println("The number of digits is "+countLog(no));//Logarithmic solution
    }
    //Iterative solution
    public static int count(long n){
        int c=0;
        while (n!=0){
            n/=10;
            c++;
        }
        return 1;
    }

    //recursive solution
    public static int countRec(long n){
        if (n==0)
            return 1;
        return 1+countRec(n/10);

    }
    //Logarithmic solution
    public static int countLog(long n){
        if (n==0)
            return 1;
        return (int)Math.floor(Math.log10(n)+1);
    }
}
