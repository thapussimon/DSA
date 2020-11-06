package Mathematics;

import java.util.Scanner;

public class Q2 {
    //To check if a Number is a Number Pallindrome or not
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();
        System.out.println("The number is a pallindrome: "+checkNumberPallindrome(no));

    }


    //Iterative Solution
    public static boolean checkNumberPallindrome(int n){
        int temp=n;
        int rev=0;
        while (temp!=0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return rev==n;
    }
}
