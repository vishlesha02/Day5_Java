import java.util.Scanner;

public class day5_p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        for (int i = 1; i < num ; i++) {
            int temp=0;
            for (int j = 2; j <i-1 ; j++) {
                if(i % j == 0){
                    temp=temp+1;

                }
                if(temp==0)
                {
                    System.out.println("Number is prime");
                }
                else {
                    System.out.println("Number is prime");;
                }
            }


        }


    }
}
