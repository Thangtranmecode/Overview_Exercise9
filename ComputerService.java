package Overview_Exercise;

import java.util.*;

public class ComputerService extends CloudService {

    int cpuCores;
    double runtimeHours;

    public ComputerService(int cpuCores, double runtimeHours, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public ComputerService() {
        super();
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getRuntimeHours() {
        return runtimeHours;
    }

    public void setRuntimeHours(double runtimeHours) {
        this.runtimeHours = runtimeHours;
    }

    @Override
    public void addService() {
        super.addService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CPU cores: ");
        cpuCores = sc.nextInt();
        System.out.print("Enter runtime hours: ");
        runtimeHours = sc.nextDouble();
    }

    @Override
    public void updateService() {
        super.updateService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Update CPU cores: ");
        cpuCores = sc.nextInt();
        System.out.print("Update runtime hours: ");
        runtimeHours = sc.nextDouble();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("CPU Cores: " + cpuCores);
        System.out.println("Runtime Hours: " + runtimeHours);
        System.out.println("Monthly Cost: " + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() + getMonthsUsed();
        if (cpuCores >= 16) {
            baseCost *= 1.25;
        } else if (cpuCores >= 8) {
            baseCost *= 1.15;
        } else {
            baseCost *= 1.05;
        }
        if (runtimeHours > 200) {
            baseCost += (runtimeHours - 200) * 0.5;
        }
        return baseCost;
    }

}
