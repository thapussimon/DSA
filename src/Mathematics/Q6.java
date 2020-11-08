package Mathematics;

import java.util.Scanner;

public class Q6 {
    //Find the LCM of two numbers
    //I have implemented an efficient solution
    //A*B=GCD(A,B)*LCM(A,B)
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("LCM OF "+a+" & "+b+" is "+lcm(a,b));

    }
    public static int gcd(int a,int b){
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int product(int a,int b){
        return a*b;
    }
    public static int lcm(int a,int b){
        //gcd*lcm=a*b
        return product(a,b)/gcd(a,b);
    }
}
