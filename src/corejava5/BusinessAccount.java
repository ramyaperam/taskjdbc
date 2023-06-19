package corejava5;
    public class BusinessAccount extends BankAccount {
        private String companyName;
        private String address;
        private String contactNumber;


        public BusinessAccount(String accountNumber, String accountHolderName, double balance, String password,
                               String companyName, String address,String contactNumber) {
            super(accountNumber, accountHolderName, balance, password);
            this.companyName = companyName;
            this.address = address;
            this.contactNumber = contactNumber;

        }

        public String getCompanyName() {
            return companyName;
        }

        public String getAddress() {
            return address;
        }

        public String getContactNumber() {
            return contactNumber;
        }

    }
