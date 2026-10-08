import java.util.Scanner;

class MyOrder {
    public static void main(String[] args) {
        int price;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menu:");
            System.out.println("1. pizza");
            System.out.println("2. sandwich");
            System.out.println("3. burger");
            System.out.print("Please enter your order (1-3): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                return;
            }
            int input = scanner.nextInt();

            if (input < 1 || input > 3) {
                System.out.println("Invalid menu option. Please enter a number between 1 and 3.");
                return;
            }

            if (input == 1) {
                price = 12;
                System.out.println("You chose the pizza. Thank you for your order.");
                System.out.println("The price of your order is: " + price);
            } else if (input == 2) {
                price = 8;
                System.out.println("You chose the sandwich. Thank you for your order.");
                System.out.println("The price of your order is: " + price);
            } else if (input == 3) {
                price = 10;
                System.out.println("You chose the burger. Thank you for your order.");
                System.out.println("The price of your order is: " + price);
            }
        }
    }
}