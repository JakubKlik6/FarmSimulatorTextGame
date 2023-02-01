import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //UserWelcome();

        FarmGenerator();
        Farm farm = new Farm(1.1,1.1,1);



    }

    public static void UserWelcome()
    {
        System.out.println("Hello and welcome to the farm simulator!");

        System.out.println("Please enter your name: ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("Hello " + userName);
    }

    public static void FarmGenerator()
    {
        Farm farm1 = new Farm();
        Farm farm2 = new Farm();
        Farm farm3 = new Farm();

    }
}