package ie.setu;

class SavingsAccount {
    static int numCounter = 1;
    static double annInRate;
    double SavingsBalance;
    int accountNum;

    public SavingsAccount(double balance) {
        setBalance(balance);
        this.accountNum = numCounter++;
    }

    public void setBalance(double balance) {
        SavingsBalance = balance;
    }

    public double getBalance() {
        return SavingsBalance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void calculateMonthlyInterest() {
        this.SavingsBalance += (SavingsBalance * annInRate) / 12;
    }

    public static void modifyInterestRate(double newAnnInRate) {
        SavingsAccount.annInRate = newAnnInRate;
    }

    public String toString() {
        return "Account number: " + accountNum + ", Account balance: " + SavingsBalance;
    }

}
