import java.util.Scanner;

public class Main {
    static String option = "0";
    static int withdrawAmount;
    static int deposit;
    static int balance;
    static String operation = "0";
    static Boolean operationTaken = true;
    static boolean validInput = false;
    static boolean AccountCreated = false;
    static String Registration_name;
    static String Registration_password;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        displayOptions();
        handleRegAndLogInputs();
    }


    public static void handleRegAndLogInputs() {
        Scanner scan = new Scanner(System.in);
        do {
            switch (option) {
                case "1":
                    createAccount();
                    AccountCreated = true;
                    System.out.println("Account created successfully");
                    displayOptions();
                    break;
                case "2":

                    if (AccountCreated) {
                        validInput = true;
                        login();
                        chooseOperation();

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

    public static void chooseOperation() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            operations();
            switch (operation) {
                case "1":
                    System.out.println("Enter the value you want to withdraw ");
                    withdrawAmount = scan.nextInt();
                    break;
                case "2":
                    System.out.println("Enter the value you want to deposit ");
                    deposit = scan.nextInt();
                    break;
                case "3":
                    System.out.println("your balance is: " + balance);
                    break;
                case "0":
                    exit = true;
                    break;
                case "-1":
                    System.exit(0);
                    break;

                default:
                    System.out.println("WRONG OPERATION TRY AGAIN:");
                    operation = scan.next();
                    break;

            }
        } while (exit == false);
        displayOptions();
        while (!option.equals("-1")) {
            handleRegAndLogInputs();
        }
    }

    public static void displayOptions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to create new Account ");
        System.out.println("Press 2 to Login ");
        System.out.println("Press -1 to Exit");
        option = scan.next();
    }

    public static void createAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        Registration_name = scan.next();
        System.out.println("Enter your password");
        Registration_password = scan.next();
        System.out.println("Enter your balance");
        balance = scan.nextInt();
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
        System.out.println("Press 1 to withdraw");
        System.out.println("Press 2 to deposit");
        System.out.println("Press 3 to check your balance");
        System.out.println("press 0 to back to display previous menu");
        System.out.println("Press -1 to exit");
        operation = scan.next();
    }
}

