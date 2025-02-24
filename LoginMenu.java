import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginValidation login = new LoginValidation("Admin", "KoolAid", 10);

        while (true) {
            System.out.print("enter username: ");
            String username = scanner.nextLine();

            System.out.print("enter password: ");
            String password = scanner.nextLine();

            int result = login.validateLogin(username, password);

            if (result == 0) {
                System.out.println("successful login attempt!!");
                break;
            } else if (result == 1) {
                System.out.println("the username is incorrect!");
            } else if (result == 2) {
                System.out.println("ehe password is incorrect!");
            } else if (result == 3) {
                System.out.println("the username and password are both incorrect!!");
            } else {
                System.out.println("you have exceeded allowed login attempts");
                break;
            }

            System.out.print("Try again? (y/n): ");
            String retry = scanner.nextLine().trim().toLowerCase();
            if (retry.equals("n")) {
                System.out.println("exiting program");
                break;
            }
        }
        scanner.close();
    }
}
