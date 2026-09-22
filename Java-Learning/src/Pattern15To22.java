public class Pattern15To22 {

    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    static void pattern17(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // increasing letters
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            // decreasing letters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    static void pattern18(int n) {

        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + n - i - 1);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
    static void pattern19(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern20(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern21(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    static void pattern22(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print(n - min);
            }

            System.out.println();
        }
    }
}
