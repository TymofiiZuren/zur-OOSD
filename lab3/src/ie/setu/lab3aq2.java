package ie.setu;

class SavingsAccount {
    static int numCounter = 0;
    static double annInRate;
    double SavingsBalance;
    int accountNum;

    public SavingsAccount(double balance) {
        setBalance(balance);
        ++numCounter;
        setAccountNum(numCounter);
    }

    public void setBalance(double balance) {
        SavingsBalance = balance;
    }

    public double getBalance() {
        return SavingsBalance;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
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
