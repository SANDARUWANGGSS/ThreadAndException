package Bank;

public class Account {
    private int accNo;
    private double balance;

    public Account(int accNo)
    {
        this.accNo = accNo;
    }
    public void displayExistingBalance()
    {
        System.out.println("Existing Amount "+balance);
    }
    public void displayAccNo()
    {
        System.out.println("Account No "+accNo);
    }

    public void deposit(double amount)
    {
        balance += amount;
//        System.out.println("Account No "+accNo);
    }

    public void withdraw(double amount) throws InsuffiecientBalance
    {
        if(balance< amount)
        {
            throw new InsuffiecientBalance(balance);
        }
        else {
            balance -= amount;
        }
//        System.out.println("Account No "+accNo);
    }
}
