package corejava4;

 class personalDetailsTask3 {
        private bankAcountTask3[] accounts;
        private String[] doorNo;
        private String[] streetNo;
        private String[] locality;
        private String[] zipCode;
        private String[] mobileNumber;
        private String[] telephoneNumber;

        public personalDetailsTask3(bankAcountTask3[] accounts, String[] doorNo, String[] streetNo, String[] locality,
                               String[] zipCode, String[] mobileNumber, String[] telephoneNumber) {
            this.accounts = accounts;
            this.doorNo = doorNo;
            this.streetNo = streetNo;
            this.locality = locality;
            this.zipCode = zipCode;
            this.mobileNumber = mobileNumber;
            this.telephoneNumber = telephoneNumber;
        }

        public void displayAddress(String accountNumber) {
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    System.out.println("Account Holder: " + accounts[i].getName());
                    System.out.println("Address: " + doorNo[i] + ", " + streetNo[i] + ", " + locality[i]);
                    System.out.println("Zip Code: " + zipCode[i]);
                    System.out.println("Mobile Number: " + mobileNumber[i]);
                    System.out.println("Telephone Number: " + telephoneNumber[i]);
                    return;
                }
            }
            System.out.println("Account not found! Please check your account number.");
        }
    }
