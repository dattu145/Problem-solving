//  if number is 156, then sum of its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12. So, 156 is a Harshad number.
import java.util.*;
class HarshadNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 0;int sum = 0;int temp;
        temp = num;
        while(i < num){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if(temp % sum == 0){
            System.out.println("It is a Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}
