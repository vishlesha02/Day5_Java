import java.util.Scanner;

public class day5_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }

            System.out.println("The Reverse is : " + rev);


    }
}
