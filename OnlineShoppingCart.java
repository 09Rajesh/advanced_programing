
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Set<String> cart = new HashSet<>();
        String[] availableItems = {
                "T-shirt", "Jeans", "Sneakers", "Backpack", "Hat"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Online Shopping!");

        while (true) {
            System.out.println("Available Items:");
            for (int i = 0; i < availableItems.length; i++) {
                System.out.println((i + 1) + ". " + availableItems[i]);
            }

            System.out.print("Select an item to add to your cart (enter item number): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber < 1 || itemNumber > availableItems.length) {
                System.out.println("Invalid item number. Please choose a valid item number.");
                continue;
            }

            String selectedItem = availableItems[itemNumber - 1];
            if (cart.contains(selectedItem)) {
                System.out.println("Item '" + selectedItem + "' is already in your cart.");
            } else {
                cart.add(selectedItem);
                System.out.println("Item '" + selectedItem + "' added to your cart.");
            }

            System.out.print("Would you like to view your cart? (yes/no): ");
            String viewCart = scanner.next();
            if (viewCart.equalsIgnoreCase("yes")) {
                System.out.println("Items in Your Cart:");
                for (String item : cart) {
                    System.out.println("- " + item);
                }
            }

            System.out.print("Do you want to continue shopping? (yes/no): ");
            String continueShopping = scanner.next();
            if (!continueShopping.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for shopping with us!");
                break;
            }
        }
    }
}
