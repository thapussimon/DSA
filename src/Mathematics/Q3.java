package Mathematics;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //To find the factorial of a number
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();
        System.out.println("The factorial is "+fact(no));//Using Iterative Approach
        System.out.println("The factorial is "+factRecursive(no));//Using Recursive approach

    }

    //Iterative approach
    public static int fact(int n){
            int res=1;
            for (int i=2;i<=n;i++){
                res*=i;
            }
            return res;
    }

    //Recursive approach
    public static int factRecursive(int n){
        if (n==0)
            return 1;
        return n*factRecursive(n-1);
    }
}
