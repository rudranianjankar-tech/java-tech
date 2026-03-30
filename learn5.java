//oops
class Student1{
    private int age;
    private String name;
    static String college="abc clg";

    //constructor

    Student1(String name , int age){
        this.name = name;
        this.age= age;

    }
    //getter and setter

    public void setname(String name){
        this.name=name;
    }

    public void setage (int age){
        if(age>0 && age<100){
            this.age=age;
        }else{
            System.out.println("invalid age");
        }
    }
    //getter 

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }


    void study(){
        System.out.println(this.name + " is studying");
    }
}

class Teacher extends Student1{
    Teacher(String name, int age) {
        super(name, age);  // calling parent constructor
    }
    void teach(){
        System.out.println("teaching");
    }

}
// compile time polymorphism - method overloading
class maths{
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add (int a,int b,int c){
        return a+b+c;
    }
}
public class learn5 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("piyush",20);
        s1.setname("piyush");
        s1.setage(20);
        s1.study();

        Student1 s2 = new Student1("anaya",30 );
        s2.setname("riya");
        s2.setage(19);
        s2.study();

        System.out.println(s1.college);

        Teacher T = new Teacher("arya",54);
        T.study();
        T.teach();

        System.out.println(s1.getname());

        maths m = new maths();
        System.out.println(m.add(2,4));
        System.out.println(m.add(12.56, 76.8));
        System.out.println(m.add(12,45,66));


        
    }
    
}
