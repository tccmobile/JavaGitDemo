import java.util.Scanner;

public class AuthoringAssistant {

    public static char printMenu(Scanner scnr){


        return 'q';
    }

    public static int getNumOfNonWSCharacters(String usrStr){

        return 0;
    }

    public static int getNumOfWords(String usrStr){

        return 0;
    }

    public static String replaceExclamation(String usrStr){

        return null;
    }

    public static String shortenSpace(String usrStr){

        return null;
    }

    public static void main(String[] args) {
      /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String usrStr;
        char choice='?';

        System.out.println("Enter a sample text:");
        usrStr = scnr.nextLine();
        System.out.println();
        System.out.println("You entered: "+usrStr);

        do{
            // Call printMenu
            choice = printMenu(scnr);
            // Execute method based on choice returned

        } while (choice!='q');


        return;
    }
}