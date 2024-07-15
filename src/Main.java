import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amount = 0;
        int newAmount;
        int password;
        int action;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter your password:");
        password = sc.nextInt();
        for (int i = 1; i < 4; i++) {
            if (password == 1234) {
                System.out.println("Account access has been verified");
                break;
            } else if (i == 3) {
                System.out.println("You entered too many incorrect passwords, you are exiting the system...");
                System.exit(0);
            } else {
                System.err.println("You entered incorrect password!");
                System.err.println("Please re-enter your password:");
                password = sc.nextInt();
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Press button 1 to withdraw money from the account");
        System.out.println("Press button 2 to increase the balance");
        System.out.println("Press button 3 to change your password");
        System.out.println("Press button 4 to see the amount in your balance");
        System.out.println("Please enter the action to be taken:");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        action = sc.nextInt();
        switch (action) {
            case 1:
                System.out.print("Enter the amount to be withdrawn:");
                int amountWithdrawn = sc.nextInt();
                newAmount = amount - amountWithdrawn;
                System.out.println("Transaction successful!");
                System.out.println("Yeni bakiyeniz:" + newAmount);
                break;
            case 2:
                System.out.println("");
                int deposit;
                deposit = sc.nextInt();
                newAmount = amount + deposit;
                System.out.println("Transaction successful!");
                System.out.println("New Amount" + newAmount);
                break;
            case 3:
                System.out.println("Enter the new password:");
                int newPassword;
                newPassword = sc.nextInt();
                System.out.println("Transaction successful!");
                System.out.println("New password:" + newPassword);
                break;
            case 4:
                System.out.println("Amount" + amount);
                break;
            default:
                System.err.println("You have logged in incorrectly, please try again");
        }
    }
}