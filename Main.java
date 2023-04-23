import java.util.Scanner;
public class Main {
            private static final String USERNAME = "admin";
            private static final String PASSWORD = "password";

            private static Scanner scanner = new Scanner(System.in);
            private static String username;
            private static String password;
            private static boolean loggedIn = false;

            public static void main(String[] args) {

                // Login form
                login();

                if (loggedIn) {
                    // Reservation form
                    System.out.println("Welcome to the Online Reservation System!");
                    System.out.println("Please fill in the following details:");
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your train number: ");
                    int trainNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.print("Enter your class type: ");
                    String classType = scanner.nextLine();
                    System.out.print("Enter the date of journey (dd-mm-yyyy): ");
                    String dateOfJourney = scanner.nextLine();
                    System.out.print("Enter the source station: ");
                    String sourceStation = scanner.nextLine();
                    System.out.print("Enter the destination station: ");
                    String destinationStation = scanner.nextLine();

                    // TODO: insert the above details into the database

                    System.out.println("Your reservation has been made successfully!");

                    // Cancellation form
                    System.out.println("If you want to cancel your reservation, please enter your PNR number:");
                    int pnrNumber = scanner.nextInt();
                    // TODO: query the database for the reservation details corresponding to the given PNR number

                    System.out.println("Are you sure you want to cancel your reservation? (y/n)");
                    String confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        // TODO: delete the reservation from the database
                        System.out.println("Your reservation has been cancelled successfully!");
                    } else {
                        System.out.println("Your reservation has not been cancelled.");
                    }
                } else {
                    System.out.println("Sorry, you are not authorized to access the Online Reservation System.");
                }
            }

            private static void login() {
                System.out.println("Welcome to the Online Reservation System!");
                System.out.print("Enter your username: ");
                username = scanner.nextLine();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    loggedIn = true;
                    System.out.println("You have been logged in successfully.");
                } else {
                    System.out.println("Incorrect username or password. Please try again.");
                    login();
                }
            }
        }