import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("enter the value of c = ");
        int c = sc.nextInt();

        float delta = b*b-(4*a*c);

        float x1 = (float)((-b+Math.sqrt(delta))/2*a);
        System.out.println("positive root of x is "+x1);
        float x2 = (float)((-b-Math.sqrt(delta))/2*a);
        System.out.println("negative root of x is "+x2);



    }
}
