import java.util.Scanner;
public class Users {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        if (user.equalsIgnoreCase("jas") && pass.equals("1224")) {
            System.out.print("\nWelcome! " + user);
        } else {
            System.out.print("You don't have access!");
        }
        input.close();
    }
}
