import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the password: ");
            String password = scan.nextLine();
            int length = 0;
            int digit = 0;
            int special = 0;
            int upperCase = 0;
            if (password.length() >= 12) {
                length = 1;
            }
            for(int i=0;i<password.length();i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    digit = 1;
                }
                if (c >= 'A' && c <= 'Z') {
                    upperCase = 1;
                }
                if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                    special = 1;
                }
            }
            if(length == 1 && digit == 1 && special == 1 && upperCase == 1) {
                System.out.println("Password is Strong.");
                break;
            } else {
                System.out.println("Password is Weak. Please enter a strong password :)");
            }
        }
        scan.close();
    }
}
