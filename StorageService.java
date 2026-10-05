package Overview_Exercise;

import java.util.*;

public class StorageService extends CloudService {

    int storageGB;
    boolean encryptionEnbled;

    public StorageService(int storageGB, boolean encryptionEnbled, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.storageGB = storageGB;
        this.encryptionEnbled = encryptionEnbled;
    }

    public StorageService() {
        super();
    }

    public int getStorageGB() {
        return storageGB;
    }

    public boolean isEncryptionEnbled() {
        return encryptionEnbled;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public void setEncryptionEnbled(boolean encryptionEnbled) {
        this.encryptionEnbled = encryptionEnbled;
    }

    @Override
    public void addService() {
        super.addService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Storage GB: ");
        storageGB = sc.nextInt();
        System.out.print("Encryption enabled(true/false): ");
        encryptionEnbled = sc.nextBoolean();

    }

    @Override
    public void updateService() {
        super.updateService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Storage GB: ");
        storageGB = sc.nextInt();
        System.out.print("Update Encryption enabled(true/false): ");
        encryptionEnbled = sc.nextBoolean();

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Storage GB: " + storageGB);
        System.out.println("Encryption Enabled: " + encryptionEnbled);
        System.out.println("Monthly Cost: " + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() + getMonthsUsed();
        if (storageGB >= 1000) {
            baseCost *= 1.20;
        } else if (storageGB >= 500) {
            baseCost *= 1.10;
        } else {
            baseCost *= 1.05;
        }
        if (encryptionEnbled) {
            baseCost *= 1.05;
        }
        return baseCost;
    }

}
