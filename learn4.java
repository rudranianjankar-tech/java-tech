import java.util.*;

// Student class
class Student {
    final int age = 10;   // final variable → cannot be changed once assigned
    int id = 10;          // normal variable → can be modified
}

// Main class
public class learn4 {
    public static void main(String[] args) {

        Student s1 = new Student();  
        // object created in heap memory
        // s1 is a reference stored in stack pointing to that object

        Student s2 = s1;  
        // no new object created
        // s2 points to the same object as s1

        s2.id = 20;  
        // changing value using s2 reference
        // affects the same object → so s1 will also see this change

        System.out.println(s1.id);  
        // prints 20 because both s1 and s2 refer to same object


        double x =10.78;
        int y = (int) x;
        System.out.println(y);//typecasting - explicit converting one data type to another



        // ternary operators
        int age=18;
        String result= (age>=18)? "adult":"minor";
        System.out.println(result);

        for(int i = 0; i<=7 ; i++){
           // if(i==3)break;
            if(i==4)continue;
            System.out.println(i);
        }
    }
}
//break - stop loop
// continue- skip iteration