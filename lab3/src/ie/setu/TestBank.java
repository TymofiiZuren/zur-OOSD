package ie.setu;

public class TestBank {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer("Steve", "1 Jordan, IL, ATLANTA");
        SavingsAccount account1 = new SavingsAccount(5000);
        SavingsAccount account2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.10F);

        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        customer1.addAccount(account1);
        customer1.addAccount(account2);

        System.out.println(customer1);
        System.out.println("Total Savings: " + customer1.balance());
    }
}
