import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        String prompt1 = "Enter your favourite integer";
        String prompt2 = "Enter your favourite double";
        int favInt;
        double favDouble;
        Scanner in = new Scanner(System.in);
        favInt = SafeInput.getInt(in,prompt1);
        favDouble = SafeInput.getDouble(in,prompt2);
        System.out.println("Your favourite integer is: " + favInt);
        System.out.println("Your favourite double is: " + favDouble);


    }
}
