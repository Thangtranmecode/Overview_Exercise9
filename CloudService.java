package Overview_Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class CloudService implements ICloudService {

    String id;
    double baseMonthlyFee;
    Date startDate;
    boolean isActive;
    int monthsUsed;

    public CloudService(String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }

    public CloudService() {
        super();
    }

    public String getId() {
        return id;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter base monthly fee: ");
        baseMonthlyFee = sc.nextDouble();
        sc.nextLine();
        try {
            System.out.print("Enter start date(dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Is active(true/false): ");
        isActive = sc.nextBoolean();
        System.out.print("Enter month used: ");
        monthsUsed = sc.nextInt();
    }

    @Override
    public void updateService() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update ID: ");
        id = sc.nextLine();
        System.out.print("Update base monthly fee: ");
        baseMonthlyFee = sc.nextDouble();
        sc.nextLine();
        try {
            System.out.print("Update start date(dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Update Is active(true/false): ");
        isActive = sc.nextBoolean();
        System.out.print("Update month used: ");
        monthsUsed = sc.nextInt();
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + id);
        System.out.println("Base Monthly Fee: " + baseMonthlyFee);
        System.out.println("Start Date: " + sdf.format(startDate));
        System.out.println("Active: " + isActive);
        System.out.println("Months Used: " + monthsUsed);
    }

    boolean isActive() {
        return false;
    }
}
