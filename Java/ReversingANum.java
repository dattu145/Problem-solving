/// Reversing a number
import java.util.*;

class ReversingANum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0,i = 0;
        while(i < num){
            int rem = num % 10; ///  Finding any number's modulus wrt 10 will give its last digit.
            rev = (rev * 10) + rem;  /// Main logic
            num = num / 10;   ///  Dividing any number wrt 10 will give the remaining value rather than last digit.
        }
        System.out.println("The reversed number is : "+rev);
    }
}
