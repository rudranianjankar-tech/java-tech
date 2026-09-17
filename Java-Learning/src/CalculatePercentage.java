import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter marks of Subject 1 : ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter marks of Subject 2 : ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter marks of Subject 3 : ");
        float sub3 = sc.nextFloat();

        System.out.println("Enter marks of Subject 4 : ");
        float sub4 = sc.nextFloat();

        System.out.println("Enter marks of Subject 5 : ");
        float sub5 = sc.nextFloat();

        float sum = sub1+sub2+sub3+sub4+sub5;
        float percentage = (sum/500)*100;
        float cgpa = percentage/9.5f;

        System.out.println("Total Marks : "+sum);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("CGPA : " + cgpa);

        sc.close();


    }

}
