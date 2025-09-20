package ie.setu;

class BankCustomer {
    String name;
    String address;
    SavingsAccount[] accounts = new SavingsAccount[3];
    double totalSavings;

    public BankCustomer(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void addAccount(SavingsAccount account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }
    }

    public double balance() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                totalSavings += accounts[i].getBalance();
            }
        }
        return totalSavings;
    }

    public String toString() {
        String output = String.format("""
                Name: %s,
                Address: %s,
                -- Account Summary --
                """, name, address);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                output += String.format("""
                Account No. %d,
                Savings %f,
                """, accounts[i].getAccountNum(), accounts[i].getBalance());
            }
        }

        return output;
    }
}
