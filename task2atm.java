import java.util.Scanner;
class User {
        private String userId;
        private String userPin;
        private double balance;

        public User(String userId, String userPin, double balance) {
            this.userId = userId;
            this.userPin = userPin;
            this.balance = balance;
        }

        public String getUserId() {
            return userId;
        }

        public String getUserPin() {
            return userPin;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    class Transaction {
        private String type;
        private double amount;
        private double balance;

        public Transaction(String type, double amount, double balance) {
            this.type = type;
            this.amount = amount;
            this.balance = balance;
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    class ATM {
        private User currentUser;
        private Transaction[] transactions;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();

            System.out.print("Enter User Pin: ");
            String userPin = scanner.nextLine();

            for (User user : users) {
                if (user.getUserId().equals(userId) && user.getUserPin().equals(userPin)) {
                    currentUser = user;
                    System.out.println("Welcome " + currentUser.getUserId() + "!");
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Invalid User ID or Pin.");
                return;
            }

            transactions = new Transaction[100];
            int transactionCount = 0;

            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                int option = scanner.nextInt();

                if (option == 1) {
                    for (int i = 0; i < transactionCount; i++) {
                        Transaction transaction = transactions[i];
                        System.out.println(transaction.getType() + " - " + transaction.getAmount() + " - " + transaction.getBalance());
                    }
                } else if (option == 2) {
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();

                    if (amount > currentUser.getBalance()) {
                        System.out.println("Insufficient balance.");
                        continue;
                    }

                    currentUser.setBalance(currentUser.getBalance() - amount);
                    transactions[transactionCount++] = new Transaction("Withdraw", amount, currentUser.getBalance());
                    System.out.println("Withdrawn " + amount + ". New balance is " + currentUser.getBalance());
                } else if (option == 3) {
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();

                    currentUser.setBalance(currentUser.getBalance() + amount);
                    transactions[transactionCount++] = new Transaction("Deposit", amount, currentUser.getBalance());
                    System.out.println("Deposited " + amount + ". New balance is " + currentUser.getBalance());
                } else if (option == 4) {
                    System.out.print("Enter Recipient User ID: ");
                    String recipientUserId = scanner.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();

                    if (amount > currentUser.getBalance()) {
                        System.out.println("Insufficient balance.");
                        continue;
                    }


                }}}}
