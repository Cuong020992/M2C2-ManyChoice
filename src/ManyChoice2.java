import java.util.Scanner;

public class ManyChoice2 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw triangle");
        System.out.println("2. Draw rectangle");
        System.out.println("3. isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = 1;

        while (choice != 0) {
            choice = sc.nextInt();
            switch (choice) {
                //vẽ hình tam giác
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                //vẽ hình chữ nhật
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;

                // vẽ tam giác cân
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
