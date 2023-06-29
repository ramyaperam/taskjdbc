package corejava12.BankTaskv7;

import java.util.Map;

public class BankImp implements BankAccount {
    public corejava12.BankTaskv7.managerLogin managerLogin;
    private String accountNumber;
    private String name;
    private double balance;
    private String password;
    private String doorNo;
    private String streetNo;
    private String locality;
    private String zipCode;
    private String mobileNumber;
    private String email;
    public BankImp(String accountNumber, String name, double balance, String password, String doorNo, String streetNo,
                   String locality, String zipCode, String mobileNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
        this.email= email;
    }

    public BankImp(Map<String, UserBankAccount> accounts, Map<String, String> accountPasswords) {
        super();
    }

    // Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = this.password;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Methods

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Door No: " + doorNo);
        System.out.println("Street No: " + streetNo);
        System.out.println("Locality: " + locality);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("email : " +email);
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String setEmail(String email) {
        return email;
    }


}
