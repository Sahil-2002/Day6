import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int num = sc.nextInt();
      int reverse = 0;
      int r ;
      while(num>0){

          r= num%10;
          reverse=reverse*10+r;
          num = num/10;


      }
        System.out.println("the reverse of entered no is : "+reverse);


    }
}
