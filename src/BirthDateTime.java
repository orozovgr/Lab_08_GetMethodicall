import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int min;

        year = SafeInput.getRangedInt(in,"Enter your year of the birth",1950,2015);
        month = SafeInput.getRangedInt(in,"Enter your month of the birth",1,12);
        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in,"Enter your day of the birth",1,30);
            break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in,"Enter your day of the birth",1,31);
                break;
            default:
                day = SafeInput.getRangedInt(in,"Enter your day of the birth",1,29);
                break;




        }
        hour = SafeInput.getRangedInt(in,"Enter your hour of the birth",1,24);
        min = SafeInput.getRangedInt(in,"Enter your min of the birth",1,59);

        System.out.printf("You are born in %d/ %d/ %d %d: %d", year,month,day,hour,min);


    }
}
