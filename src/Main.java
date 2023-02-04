import Plants.Seedlings;
import Plants.Wheat;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.playerName =  UserWelcome();

        System.out.println("Now you can decide which farm you want to buy: \n");

        Farm farm1 = generateRandomObject();
        Farm farm2 = generateRandomObject();
        Farm farm3 = generateRandomObject();

        System.out.println("Farm 1" + farm1.toString());
        System.out.println("Farm 2" + farm2.toString());
        System.out.println("Farm 3" + farm3.toString());

        int userChoice = buyingFarm();

        switch (userChoice) {
            case 1 -> player1.farm = farm1;
            case 2 -> player1.farm = farm2;
            case 3 -> player1.farm = farm3;
        }

        Wheat wheat = new Wheat();

    }

    public static String UserWelcome()
    {
        System.out.println("Hello and welcome to the farm simulator!");

        System.out.print("Please enter your name: ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("\nHello " + userName);
        return userName;


    }

    public static int buyingFarm(){
        System.out.print("\nPress 1,2 or 3 to buy farm!: ");

        Scanner userInput = new Scanner(System.in);
        String numberInput = userInput.nextLine();

        int num = Integer.parseInt(numberInput);

        while(true)
        {
            if(num == 1) {
                System.out.println("You have bought farm number 1!");
                return 1;
            }
            if(num == 2) {
                System.out.println("You have bought farm number 2!");
                return 2;
            }
            if(num==3){
                System.out.println("You have bought farm number 3!");
                return 3;
            }
            else
            {
                System.out.println("You have entered invalid value!");
                continue;
            }
        }
    }

    public static Farm generateRandomObject() {
        Random random = new Random();
        double x = random.nextInt(500);
        int y = random.nextInt(5);
        return new Farm(x, y);
    }


}