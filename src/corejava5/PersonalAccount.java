package corejava5;
public class PersonalAccount extends BankAccount {
    private String address;
    private String zipCode;
    private String phoneNumber;
    private String  name;

    public PersonalAccount(String accountNumber, String accountHolderName, double balance, String password,
                           String address, String zipCode, String phoneNumber) {
        super(accountNumber, accountHolderName, balance, password);
        this.address = address;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.name=accountHolderName;

    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name ;
    }
}
