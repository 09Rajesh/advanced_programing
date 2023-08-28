import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Online Shopping Cart");
        System.out.println("2. Store Inventory System");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                runOnlineShoppingCart();
                break;
            case 2:
                runStoreInventorySystem();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void runOnlineShoppingCart() {
        OnlineShoppingCart.main(new String[0]);
    }

    private static void runStoreInventorySystem() {
        StoreInventorySystem.main(new String[0]);
    }
}
