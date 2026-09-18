import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum =0;
        int count = 0;

        while(count<50){
            sum = sum+num;
            num = num + 10;
            count++;
        }
        System.out.println(sum);
    }
}
