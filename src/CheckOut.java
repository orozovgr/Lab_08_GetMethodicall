import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double totalPrice = 0;
        Scanner in = new Scanner(System.in);
        do
        {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.01, 10.0);
            totalPrice = totalPrice + price;


        } while (SafeInput.getYNConfirm(in, "Do you have more items"));
        System.out.printf("Total price of your item is: %.2f" , totalPrice);


    }

}