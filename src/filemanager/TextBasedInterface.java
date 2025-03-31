package filemanager;
import java.util.Scanner;

public class TextBasedInterface implements UserInterface {
    private UIEventHandler handler = null;

    @Override
    public void start() {
        if (handler == null) {
            System.out.println("Error: No event handler subscribed.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu inside the loop
            System.out.println("\nFile Manager Menu:");
            System.out.println("1. List Files");
            System.out.println("2. Create a Directory");
            System.out.println("3. Delete a File or Directory");
            System.out.println("4. Exit program");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine().trim(); // Read as string to prevent input mismatch errors

            if (!input.matches("[1-4]")) {  // Validate input (only 1-4 allowed)
                System.out.println("Invalid input. Please enter a valid number (1-4).");
                continue;
            }

            int choice = Integer.parseInt(input); // Convert to integer after validation

            switch (choice) {
                case 1:
                    System.out.print("Enter the directory path: ");
                    handler.onList(scanner.nextLine().trim());
                    break;
                case 2:
                    System.out.print("Enter the path for the new directory: ");
                    handler.onCreate(scanner.nextLine().trim());
                    break;
                case 3:
                    System.out.print("Enter the path of the file/directory to delete: ");
                    handler.onDelete(scanner.nextLine().trim());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;  // No need to close scanner here
                default:
                    System.out.println("Unexpected error.");
            }
        }
    }

    @Override
    public void subscribe(UIEventHandler handler) {
        if (this.handler == null) {
            this.handler = handler;
        } else {
            System.out.println("Handler already subscribed.");
        }
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
