package Bank;

public class InsuffiecientBalance extends Exception{
    private double amount;

    public InsuffiecientBalance(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }


}
