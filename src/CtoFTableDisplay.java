import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args) {
        System.out.printf("%10s %10s", "Celcius", "Farenheit");

       for (int i = -100; i <= 100; i ++ ){
           System.out.printf("%n%10d %10.2f", i, CtoF(i));
       }
    }

    public static double CtoF(double celsius){



          return (celsius * 1.8) + 32;

    }

}
