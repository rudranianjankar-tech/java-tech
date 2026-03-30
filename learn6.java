abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("eating");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("meow meow");
    }
}

interface Teachers {
    void teach();
}

class Kid implements Teachers{
    public void teach() {   // fixed method name
        System.out.println("learns");
    }
}

public class learn6 {
    public static void main(String[] args) {

        Animal an = new Cat();  // polymorphism
        an.sound();
        an.eat();

        Cat c1 = new Cat();     // normal object
        c1.sound();

        Kid k = new Kid();      // using interface implementation
        k.teach();

        //exception handling

        int i = 2;
        int j = 0;
        String str = null;

        int nums[]= new int[5];

        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            
        }
        catch(ArithmeticException e){
            System.out.println("something went wrong" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array problem");
        }
        catch(Exception e){
             System.out.println("something went wrong"+ e);
        }
        finally{
            System.out.println("continues");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}