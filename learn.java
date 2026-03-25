import java.util.*;
public class learn {
    public static void main (String[] args){
        System.out.println("hello world");
       //2 
       Scanner sc = new Scanner (System.in);
       System.out.println("enter first no.");
       int num1 = sc.nextInt();
       System.out.println("enter second no.");
       int num2= sc.nextInt();

       System.out.println("you entered : "+ num1 + " and "+num2 );

      int temp = num1;
      num1 = num2;
      num2 = temp;
       System.out.println("num1="+ num1 + " "+ "num2=" + num2);

       /* 3- int num =88;

       if(num%2==0){
        System.out.println("its even no.");
       }else{
        System.out.println("it is odd");
       }*/

       /* 4-  int a = 12, b = 45, c = 34;

        if(a>=b && a>=c)
        {
            System.out.println("a is largest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }*/
      // Scanner sc = new Scanner (System.in);

        int a = 16 , b = 67 ;
        char op = sc.next().charAt(0);

        switch(op){
            case'+':
            System.out.println(a+b);
            break;

            case'-':
            System.out.println(a-b);
            break;

            case'*':
            System.out.println(a*b);
            break;

            case'/':
            System.out.println(a/b);
            break;

            case'%':
            System.out.println(a%b);
            break;

            default:
                System.out.println("invalid character");
        }


        //6
        int n = 15;
        int n1 = 0, n2 = 1;

        System.out.print(n1 + " " + n2 + " ");

        for( int i=2; i<n; i++)
        {
            int c = n1+n2;
            System.out.print(c+" ");
            n1=n2;
            n2=c;
        }

        //7
        

         



    


      
       
       
    }
}