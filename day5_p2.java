
import java.util.Scanner;
public class day5_p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum=0;

        for (int i = 1; i <= num/2; i++) {

            if (num % i == 0) {
                 sum =sum+i;
                 System.out.println("The divisor are : " + i);

            }
        }
                if (num == sum) {
                    System.out.println("It is a perfect Number : " + num + " = " + sum);

                }
                else {
                    System.out.println("It is not a perfect Number : " + num + " != " + sum);
                }

        }
    }


