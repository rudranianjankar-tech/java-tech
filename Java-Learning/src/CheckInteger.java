import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        double num = sc.nextDouble();

        if(num%1==0){
            System.out.println("number is an integer");
        }else{
            System.out.println("number is not an integer ");
        }
        sc.close();
    }
}
