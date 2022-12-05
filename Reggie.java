
import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = "";
        boolean run = true;
        String socialSecurityNum = SafeInput.getRegExString(in, "Enter your social security number", "^[0-9]{3}-[0-9]{2}-[0-9]{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{8}");
        do {
            System.out.println("Select a menu option:\n    O: Open\n    S: Save\n    V: View\n    Q: Quit");
            if (in.hasNext()) {
                ans = in.nextLine().toUpperCase();
                if (ans.equals("O") || ans.equals("S") || ans.equals("V") || ans.equals("Q")) {
                    run = false;
                }
            }
        } while (run);
    }
}