import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        double total = 0;

        System.out.println("===== RESTAURANT MENU =====");
        System.out.println("1. Pizza     - Rs. 150");
        System.out.println("2. Burger    - Rs. 100");
        System.out.println("3. Sandwich  - Rs. 80");
        System.out.println("4. Pasta     - Rs. 120");
        System.out.println("5. Coffee    - Rs. 50");

        System.out.print("Enter number of items you want: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter item number (1-5): ");
            choice = sc.nextInt();

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            switch (choice) {
                case 1:
                    total += 150 * quantity;
                    break;

                case 2:
                    total += 100 * quantity;
                    break;

                case 3:
                    total += 80 * quantity;
                    break;

                case 4:
                    total += 120 * quantity;
                    break;

                case 5:
                    total += 50 * quantity;
                    break;

                default:
                    System.out.println("Invalid item number!");
                    break;
            }
        }

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount = Rs. " + total);

        sc.close();
    }
}

