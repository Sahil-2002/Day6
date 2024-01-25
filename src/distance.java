import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the X coordinate  ");
        int X = sc.nextInt();
        System.out.println("enter the Y coordinate ");
        int Y = sc.nextInt();
        // calculate distance
        float distance = (float) (Math.sqrt(Math.pow(X,2)+ Math.pow(Y,2)));
        System.out.println("distance is "+distance);

    }
}
