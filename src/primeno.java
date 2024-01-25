import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int count=0;

            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;

                    }
                }
                //count = count;
                if (count == 2) {
                    System.out.println(num + " is prime number ");
                } else {
                    System.out.println(num + " it is not prime number ");
                }
            } else {
                System.out.println("invalid input ");
            }
        }
    }

