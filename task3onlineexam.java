import java.util.Scanner;

    class task3onlineexam {

        private static String username;
        private static String password;
        private static boolean isLoggedIn = false;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Welcome to the Online Examination System");
                System.out.println("----------------------------------------");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        login(input);
                        break;
                    case 2:
                        register(input);
                        break;
                    case 3:
                        System.out.println("Thank you for using our system. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void login(Scanner input) {
            System.out.print("Enter username: ");
            String enteredUsername = input.next();
            System.out.print("Enter password: ");
            String enteredPassword = input.next();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                isLoggedIn = true;
                System.out.println("Login successful. Welcome, " + username + "!");
                updateProfile(input);
                selectAnswers(input);
                timerAndSubmit(input);
                closeSession();
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        private static void register(Scanner input) {
            System.out.print("Enter username: ");
            username = input.next();
            System.out.print("Enter password: ");
            password = input.next();
            System.out.println("Registration successful. You may now login.");
        }

        private static void updateProfile(Scanner input) {
            if (isLoggedIn) {
                System.out.println("Update Profile and Password");
                System.out.println("---------------------------");
                System.out.print("Enter new username (leave blank to skip): ");
                String newUsername = input.next();
                System.out.print("Enter new password (leave blank to skip): ");
                String newPassword = input.next();

                if (!newUsername.isEmpty()) {
                    username = newUsername;
                }

                if (!newPassword.isEmpty()) {
                    password = newPassword;
                }

                System.out.println("Profile updated successfully.");
            } else {
                System.out.println("You need to login first.");
            }
        }

        private static void selectAnswers(Scanner input) {
            if (isLoggedIn) {
                System.out.println("Selecting answers for MCQs");
                System.out.println("---------------------------");
                // code to select answers
            } else {
                System.out.println("You need to login first.");
            }
        }

        private static void timerAndSubmit(Scanner input) {
            if (isLoggedIn) {
                System.out.println("Timer and auto submit");
                System.out.println("---------------------");
                // code to implement timer and auto-submit
            } else {
                System.out.println("You need to login first.");
            }
        }

        private static void closeSession() {
            isLoggedIn = false;
            System.out.println("Session closed. Logout successful.");
        }
    }
