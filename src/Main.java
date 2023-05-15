import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option = "0";
        boolean validInput = false;
        boolean AccountCreated = false;
        displayOptions();
        option = scan.next();
        do {
            switch (option) {
                case "1":
                    createAccount();
                    AccountCreated = true;
                    System.out.println("Now press 2 to login:");
                    option = scan.next();
                    break;
                case "2":

                    if (AccountCreated == true) {
                        validInput = true;
                        login();
                    } else {
                        System.out.println("Please create new Account first press (1) or (-1) to exit:");
                        option = scan.next();
                    }
                    break;
                case "-1":
                    validInput = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("WRONG OPTION TRY AGAIN:");
                    option = scan.next();
                    break;
            }
        } while (validInput == false); // if input is unexpected value switch will repeat

    }

    public static void displayOptions() {
        System.out.println("Press 1 to create new Account ");
        System.out.println("Press 2 to Login ");
        System.out.println("Press -1 to Exit");

    }

    public static void createAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String Registration_name = scan.next();
        System.out.println("Enter your password");
        String Registration_password = scan.next();
        System.out.println("Enter your balance");
        int balance = scan.nextInt();
    }

    public static void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String Login_name = scan.next();
        System.out.println("Enter your password");
        String Login_password = scan.next();
    }
    public static void operations() {
        Scanner scan = new Scanner(System.in);
        System.out.println("withdraw");
        System.out.println("deposite");
        System.out.println("check");
        System.out.println("Exit");
    }
}

