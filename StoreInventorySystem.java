import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreInventorySystem {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Store Inventory System");
        System.out.println("----------------------");

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Check Quantity");
            System.out.println("3. Remove Item");
            System.out.println("4. List Inventory");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.put(itemName, quantity);
                    System.out.println("Item '" + itemName + "' added to inventory.");
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String checkItemName = scanner.nextLine();
                    Integer checkQuantity = inventory.get(checkItemName);
                    if (checkQuantity != null) {
                        System.out.println("Quantity of '" + checkItemName + "' in inventory: " + checkQuantity);
                    } else {
                        System.out.println("Item '" + checkItemName + "' not found in inventory.");
                    }
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    String removeItemName = scanner.nextLine();
                    if (inventory.containsKey(removeItemName)) {
                        inventory.remove(removeItemName);
                        System.out.println("Item '" + removeItemName + "' removed from inventory.");
                    } else {
                        System.out.println("Item '" + removeItemName + "' not found in inventory.");
                    }
                    break;
                case 4:
                    System.out.println("Inventory:");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.println("- " + entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
