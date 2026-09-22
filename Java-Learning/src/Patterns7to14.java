public class Patterns7to14 {
    public static void main(String[] args) {
       // Pattern7(5);
       // pattern8(5);
        //pattern 9
        pattern14(5);
    }
    static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern8(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    static void pattern10(int n){
        for(int i =0 ;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars= 2*n-i;
            for(int j = 0;j<=stars ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern11(int n){
        for(int i =0;i<n;i++){
            int start = 1;
            if(i%2==0)start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
         int space = 2*(n-1);
         for(int i =1;i<=n;i++){
             //numbers
             for(int j= 1;j<=i;j++){
                 System.out.print(j);
             }
             //space
             for(int j =1;j<=space;j++){
                 System.out.print(" ");
             }
             //numbers
             for(int j= i;j>=1;j--){
                 System.out.print(j);
             }
             System.out.println();
             space -=2;
         }

    }
    static void pattern13(int n){
        int num =1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num = num +1;
            }
            System.out.println();
        }

    }
    static void pattern14(int n){

            for (int i = 0; i < n; i++) {

                for (char ch = 'A'; ch <= 'A' + i; ch++) {
                    System.out.print(ch);
                }

                System.out.println();

        }
    }

}
