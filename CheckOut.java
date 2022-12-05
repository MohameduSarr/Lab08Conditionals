
import java.util.Scanner;
public class CheckOut {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean ans;
        do {
            totalPrice += SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99);
            ans = SafeInput.getYNConfirm(in, "Do you have more items");
        } while (ans);
        System.out.printf("The total cost: %.02f\n", totalPrice);
    }
}