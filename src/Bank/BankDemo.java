package Bank;

import java.util.Scanner;

public class BankDemo {
    public static void main(String args[])
    {
        boolean state = true;

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (state)
        {
        Account account = new Account(47876);
        System.out.println("Depositing Rs. 10000");
        account.deposit(10000.00);


        try {
            while (true)
            {
                System.out.println("Enter your amount to be withdrawn : ");
                double amount = scanner1.nextDouble();
                System.out.println("Withdrawing amount is "+amount);
                account.withdraw(amount);
                account.displayExistingBalance();
            }
//            System.out.println("\nWithdrawing Rs. 6000");
//            account.withdraw(6000);
//
//            System.out.println("\nWithdrawing Rs. 6000");
//            account.withdraw(8000);
        }
        catch (InsuffiecientBalance e)
        {
            System.out.println("Sorry, Your account remains only "+e.getAmount());
            e.printStackTrace();
        }
        finally {
            System.out.println("Do You Want To Continue :");
            String ans = scanner2.nextLine();
            if (ans.equalsIgnoreCase("no")) {
                state = false;
            }
        }
        }
    }
}
