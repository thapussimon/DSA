import java.util.Scanner;

public class SpecialNumber {
    //Special number
    //A number n is called special number if n can be expressed as the power of two integers, n = pow(x,y),
    // where x>0 and y>1.
    //
    //
    //
    //Example 1:
    //
    //n = 16
    //
    //Output: true
    //
    //Explanation: 16 = 2 raise to 4 or 4 raise to 2

    //Sample Output 1:
    //
    //true
    //
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(check(n));


    }
    public static boolean check(int n){
        for (int x=2;x<Math.sqrt(n);x++){
            int y=2;
            int pow=(int)Math.pow(x,y);
            while (pow<=n){
                if (pow==n){
                    return true;
                }
                y++;
                pow=(int)Math.pow(x,y);
            }


        }
        return false;
    }
}

