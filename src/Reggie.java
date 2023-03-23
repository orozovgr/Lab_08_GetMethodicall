import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        String SSN;
        String MNumber;
        String menuChoice;
        Scanner in = new Scanner(System.in);
        SSN = SafeInput.getRegExString(in,"Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        MNumber = SafeInput.getRegExString(in,"Enter your M number","^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in,"Enter your menuChoice","^[OoSsVvQq]$");

        System.out.println("Your SSN is" + SSN);
        System.out.println("Your M number is" + MNumber);
        System.out.println("Your menuChoice is" + menuChoice);


    }
}
