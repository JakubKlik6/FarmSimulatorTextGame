import Plants.Seedlings;
import Plants.Wheat;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.playerName = UserWelcome();

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

        userMove();


    }

    public static String UserWelcome() {
        System.out.println("Hello and welcome to the farm simulator!");

        System.out.print("Please enter your name: ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("\nHello " + userName);
        return userName;


    }

    public static int buyingFarm() {
        int num = 0;

        while (true) {

            System.out.print("\nPress 1,2 or 3 to buy farm!: ");

            Scanner userInput = new Scanner(System.in);

            String numberInput = userInput.nextLine();

            try {
                num = Integer.parseInt(numberInput);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

            if (num == 1) {
                System.out.println("You have bought farm number 1!");
                return 1;
            }
            if (num == 2) {
                System.out.println("You have bought farm number 2!");
                return 2;
            }
            if (num == 3) {
                System.out.println("You have bought farm number 3!");
                return 3;
            } else {
                System.out.println("You have entered invalid value!");
            }
        }
    }

    public static Farm generateRandomObject() {
        Random random = new Random();
        double x = random.nextInt(500);
        int y = random.nextInt(5);
        return new Farm(x, y);
    }


    public static int userMove() {
        System.out.println("What do u want to do? ...");
        System.out.println("Choose option between 1 - 5\n");

        System.out.println("1. I want to buy something");
        System.out.println("2. I want to sell something");
        System.out.println("3. View my goods");
        System.out.println("4. Next Round");

        int num = 0;
        Scanner userInput = new Scanner(System.in);
        String numberInput = userInput.nextLine();

        try {
            num = Integer.parseInt(numberInput);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        switch (num) {
            case 1: {
                System.out.println("1. I want to buy animal");
                System.out.println("2. I want to buy plant");
                System.out.println("3. I want to buy land or house");
                System.out.println("4. Return");

                int num1 = 0;

                try {
                    num1 = Integer.parseInt(numberInput);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num1 == 1) {
                    System.out.println("Which animal u want to buy?");
                    System.out.println("1. Cow - 50");
                    System.out.println("2. Pig - 25");
                    System.out.println("3. Chicken - 10");
                    System.out.println("4. Return");
                }
                if (num1 == 2) {
                    System.out.println("Which seedling u want to buy?");
                    System.out.println("1. Cabbage - 15");
                    System.out.println("2. Wheat - 15");
                    System.out.println("3. Beetroot - 15");
                    System.out.println("4. Return");
                }
                if (num1 == 3) {
                    System.out.println("What u want to buy?");
                    System.out.println("1. House - 500");
                    System.out.println("2. Land - 300");
                    System.out.println("3. Beetroot - 15");
                    System.out.println("4. Return");
                }
                if (num1 == 4) {

                }

            }

            case 2: {
                System.out.println("What do you want to sell?");
                System.out.println("1. Animal");
                System.out.println("2. Plant");
                System.out.println("3. Return");

                int num2 = 0;

                try {
                    num2 = Integer.parseInt(numberInput);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num2 == 1) {
                    System.out.println("Which animal u want to sell?");
                    System.out.println("1. Cow - 200");
                    System.out.println("2. Pig - 100");
                    System.out.println("3. Chicken - 40");
                    System.out.println("4. Return");
                }
                if (num2 == 2) {
                    System.out.println("Which seedling u want to sell?");
                    System.out.println("1. Cabbage - 1500");
                    System.out.println("2. Wheat - 5000");
                    System.out.println("3. Beetroot - 800");
                    System.out.println("4. Return");
                }
                if (num2 == 3) {

                }

            }

            case 3: {

            }
            case 4: {

            }
            default:
        }
        return 0;
    }


}