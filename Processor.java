package Overview_Exercise;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        CloudServiceArrayList manager = new CloudServiceArrayList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Cloud Service Management =====");
            System.out.println("1. Add StorageService");
            System.out.println("2. Add ComputeService");
            System.out.println("3. Update Service by ID");
            System.out.println("4. Delete Service by ID");
            System.out.println("5. Display All Services");
            System.out.println("6. Display Active Services");
            System.out.println("7. Find Highest Monthly Cost");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {

                    StorageService storage = new StorageService();
                    storage.addService();
                    manager.addServiceToArrayList(storage);
                }
                case 2 -> {
                    ComputerService computer = new ComputerService();
                    computer.addService();
                    manager.addServiceToArrayList(computer);
                }
                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    manager.updateServiceById(updateId);
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    manager.deleteServiceById(deleteId);
                }
                case 5 ->
                    manager.displayAllServices();
                case 6 ->
                    manager.displayActiveServices();
                case 7 -> {
                    double maxCost = manager.findHighestMonthlyCost();
                    System.out.println("Highest Monthly Cost: " + maxCost);
                }
                case 8 ->
                    System.out.println("Exiting program...");
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}
