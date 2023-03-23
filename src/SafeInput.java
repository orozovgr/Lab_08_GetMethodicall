import java.util.Scanner;

public class SafeInput
{
    /**
     * gets any int
     *
     *
     * @param pipe The scanner uses the input on System.in
     * @param prompt tells the user what to enter
     * @return int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        int retValue = 0;
        String trash = "";

        do {

            System.out.println("\n" + prompt + ":");
            if(pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }

        }while(!done);

        return retValue;

    }

    /**
     * get the int between high and low range
     *
     *
     * @param pipe The scanner uses the input on System.in
     * @param prompt tells the user what to enter
     * @param low low end of range
     * @param high high end the range
     * @return end within range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int retValue = 0;
        String trash = "";

        do {

            System.out.println("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                if(retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("You must enter a value in range: " + trash);

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int: " + trash);
            }

        }while(!done);

        return retValue;

    }


    /**
     * get any double
     *
     *
     * @param pipe The scanner uses the input on System.in
     * @param prompt tells the user what to enter
     * @return a double
     */
    public static Double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double retValue = 0;
        String trash = "";

        do {

            System.out.println("\n" + prompt + ": ");
            if(pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not: " + trash);
            }

        }while(!done);

        return retValue;

    }

    /**
     * Gets a double from the user within the specified range of low to high
     * @param pipe Scanner to user for input
     * @param prompt prompt for the user to know ot input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a valid double with no contraints
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double retValue = 0;
        String trash = "";

        do {

            System.out.println("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                if (retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("You must enter a value in range [\" + low + \" - \" + high + \"]: \"  " + trash);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double: " + trash);
            }

        }while(!done);

        return retValue;

    }

    /**
     * get String that matches a regEx
     *
     * @param pipe Scanner to use for input on System.in
     * @param prompt tells the user what do you want
     * @param regEx regEx pattern to match
     * @return String that matches the pattern
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retValue = "";
        boolean done = false;

        do{
            System.out.print("\n" + prompt + " " + regEx + ": ");
            retValue = pipe.nextLine();

            if(retValue.matches(regEx))
            {
                done= true;
            }
            else System.out.println("You must enter a String that matches the pattern: " + regEx);

        }while(!done);

        return retValue;
    }

    /**
     * get a String from the user that must be at least one character
     *
     * @param pipe Scanner to use for input on System.in
     * @param prompt tells user what is needed
     * @return a non =
     */
    public static String getNonZeroLengthString(Scanner pipe, String prompt)
    {
        String retValue ="";
        boolean done = false;

        do{
            System.out.print("\n" + prompt + ": ");
            retValue = pipe.nextLine();

            if(retValue.length() > 0)
                done = true;
            else
                System.out.println("You must enter some characters!");

        }while(!done);

        return retValue;

    }

    /**
     * get a [Y/N] confirmation from the user
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg for user does not need [Y/N]
     * @return - true for yes false for no
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + "[Y/N]");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            } else if (response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answer [Y/N]! " + response);
            }


        }while (!gotAVal);

        return retVal;


    }

    /**
     * Display Pretty Header
     * @param title - title of the header
     * @return - pretty header string
     */

    public static void prettyHeader(String title){
        final int HEADER_LENGTH = 60;
        int  space = (HEADER_LENGTH - 6 - title.length())/2;

        for(int i = 0; i < HEADER_LENGTH; i ++){
            System.out.print("*");
        }

        System.out.println("");

        for(int i = 0; i < 3; i ++){
            System.out.print("*");
        }

        for(int i = 0; i < space; i ++){
            System.out.print(" ");
        }

        System.out.print(title);

        for(int i = 0; i < space; i ++){
            System.out.print(" ");
        }

        for(int i = 0; i < 3; i ++){
            System.out.print("*");
        }

        System.out.println("");

        for(int i = 0; i < HEADER_LENGTH; i ++){
            System.out.print("*");
        }
    }




}



