import java.util.Scanner;

public class BankAccountMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean run = true;
        while (run)
        {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                choice 1:
                    System.out.println("Enter amount to add: ");
                    double adding = sc.nextDouble();
                    if (adding > 0)
                    {
                        System.out.println("Added $" + adding);
                        balance += adding;
                        System.out.println("New balance: $" + balance);
                    }
                    else
                    {
                        System.out.println("Error");
                    }
                    break;
                choice 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawing = sc.nextDouble();
                    if (withdrawing > 0 && withdrawing <= balance) {
                        System.out.println("Withdrew $" + withdrawing);
                        balance -= withdrawing;
                        System.out.println("New balance: $" + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient funds");
                    }
                    break;

                choice 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                choice 4:
                    System.out.println("Goodbye!");
                    run = false;
                    break;
            }
        }
    }
}