package Overview_Exercise;

import java.util.ArrayList;

public class CloudServiceArrayList {

    private ArrayList<CloudService> services = new ArrayList<>();

    public void addServiceToArrayList(CloudService service) {
        services.add(service);
        System.out.println("Service added successfully!");
    }

    public void updateServiceById(String id) {
        for (CloudService s : services) {
            if (s.getId().equals(id)) {
                s.updateService();
                System.out.println("Service updated successfully!");
                return;
            }
        }
        System.out.println("Service not found!");
    }

    public void deleteServiceById(String id) {
        for (CloudService s : services) {
            if (s.getId().equals(id)) {
                services.remove(s);
                System.out.println("Service deleted successfully!");
                return;
            }
        }
        System.out.println("Service not found!");
    }

    public void displayAllServices() {
        if (services.isEmpty()) {
            System.out.println("No services available.");
            return;
        }
        for (CloudService s : services) {
            s.displayDetails();
            System.out.println("-------------------");
        }
    }

    public void displayActiveServices() {
        boolean found = false;
        for (CloudService s : services) {
            if (s.isActive()) {
                s.displayDetails();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No active services found.");
        }
    }

    public double findHighestMonthlyCost() {
        if (services.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (CloudService s : services) {
            double cost = s.calculateMonthlyCost();
            if (cost > max) {
                max = cost;
            }
        }
        return max;
    }
}
