import Properties.Farm;
import Properties.House;
import Properties.Land;
import Properties.Player;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int weekNumber = 1;

        //GAME STARTING UI
        Properties.Player player1 = new Properties.Player();

        player1.playerName = UserWelcome();

        System.out.println("Now you can decide which farm you want to buy: \n");

        Properties.Farm farm1 = generateRandomFarm();
        Properties.Farm farm2 = generateRandomFarm();
        Properties.Farm farm3 = generateRandomFarm();

        System.out.println("Farm 1: " + farm1.toString());
        System.out.println("Farm 2: " + farm2.toString());
        System.out.println("Farm 3: " + farm3.toString());

        int userChoice = buyingFarm();

        switch (userChoice) {
            case 1 -> player1.farm = farm1;
            case 2 -> player1.farm = farm2;
            case 3 -> player1.farm = farm3;
        }

        System.out.println("You start your game at: 01.01.2021, it's first week of your journey!");
        System.out.println("Good luck!");

        //GAMEPLAY STARTS HERE
        do {
            while (true) {

                System.out.println("What do u want to do? ...");
                System.out.println("Choose option between 1 - 4\n");

                System.out.println("1. I want to buy something");
                System.out.println("2. I want to sell something");
                System.out.println("3. View my goods");
                System.out.println("4. Next Round");
                System.out.print("... ");

                GameWinnerCheck(player1);

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
                        int userFirstChoice = UserFirstChoice();
                        if (userFirstChoice == 11) {
                            player1.farm.house.houseCapacity -= 3;
                            player1.farm.house.CapacityCheck();
                            player1.salary -= 1;


                        }
                        if (userFirstChoice == 12) {
                            player1.farm.house.houseCapacity -= 2;
                            player1.farm.house.CapacityCheck();
                            player1.salary -= 1;
                        }
                        if (userFirstChoice == 13) {
                            player1.farm.house.houseCapacity -= 1;
                            player1.farm.house.CapacityCheck();
                            player1.salary -= 1;
                        }
                        if (userFirstChoice == 21) {
                            player1.farm.land.numberOfPlants -= 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary -= 1;
                        }
                        if (userFirstChoice == 22) {
                            player1.farm.land.numberOfPlants -= 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary -= 1;
                        }
                        if (userFirstChoice == 23) {
                            player1.farm.land.numberOfPlants -= 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary -= 1;
                        }
                        if (userFirstChoice == 31) {
                            House newHouse = HouseGenerator();
                            System.out.println(newHouse.toString());
                            System.out.println("Press 1 to buy or 2 to return");

                            int houseDecision = 0;
                            Scanner userHouseChoice = new Scanner(System.in);
                            String userHouseNumber = userInput.nextLine();

                            try {
                                houseDecision = Integer.parseInt(userHouseNumber);
                            } catch (Exception e) {
                                System.out.println("Invalid input!");
                            }

                            while (true) {
                                if (houseDecision == 1) {
                                    player1.farm.house = newHouse;
                                    return;
                                }
                                if (houseDecision == 2) {
                                    return;
                                }
                            }
                        }
                        if (userFirstChoice == 32) {
                            Land newLand = LandGenerator();
                            System.out.println(newLand.toString());
                            System.out.println("Press 1 to buy or 2 to return");

                            int landDecision = 0;
                            Scanner userLandChoice = new Scanner(System.in);
                            String userLandNumber = userInput.nextLine();

                            try {
                                landDecision = Integer.parseInt(userLandNumber);
                            } catch (Exception e) {
                                System.out.println("Invalid input!");
                            }

                            while (true) {
                                if (landDecision == 1) {
                                    player1.farm.land = newLand;
                                    return;
                                }
                                if (landDecision == 2) {
                                    return;
                                }
                            }

                        }
                        if (userFirstChoice == 0) {
                            continue;
                        }


                    }
                    case 2: {

                        int userSecondChoice = UserSecondChoice();

                        if (userSecondChoice == 11) {
                            player1.farm.house.houseCapacity += 3;
                            player1.farm.house.CapacityCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 12) {
                            player1.farm.house.houseCapacity += 2;
                            player1.farm.house.CapacityCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 13) {
                            player1.farm.house.houseCapacity += 1;
                            player1.farm.house.CapacityCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 21) {
                            player1.farm.land.numberOfPlants += 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 22) {
                            player1.farm.land.numberOfPlants += 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 23) {
                            player1.farm.land.numberOfPlants += 1;
                            player1.farm.land.NumberOfPlantsCheck();
                            player1.salary += 1;
                        }
                        if (userSecondChoice == 0) {
                            continue;
                        }
                    }
                    case 3: {
                        System.out.println(player1.toString());
                    }

                    case 4:
                        NextRound(weekNumber);
                }
            }
        } while (player1.salary > 0);
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

    public static House HouseGenerator() {
        Random random = new Random();
        int x = random.nextInt(75);
        int y = random.nextInt(500);
        return new House(x, y);
    }

    public static Land LandGenerator() {
        Random random = new Random();
        int x = random.nextInt(150);
        int y = random.nextInt(1000);
        return new Land(x, y);
    }

    public static Farm generateRandomFarm() {
        Random random = new Random();
        double x = random.nextInt(500);
        House house = HouseGenerator();
        Land land = LandGenerator();

        return new Farm(x, house, land);
    }


    public static int UserFirstChoice() {
        System.out.println("1. I want to buy animal");
        System.out.println("2. I want to buy plant");
        System.out.println("3. I want to buy land or house");
        System.out.println("4. Return");

        int num = 0;
        while (true) {
            Scanner userInput = new Scanner(System.in);
            String numberInput = userInput.nextLine();

            try {
                num = Integer.parseInt(numberInput);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

            if (num == 1) {
                System.out.println("Which animal u want to buy?");
                System.out.println("1. Cow - 50");
                System.out.println("2. Pig - 25");
                System.out.println("3. Chicken - 10");
                System.out.println("4. Return");

                int num1 = 0;
                Scanner userInput1 = new Scanner(System.in);
                String numberInput1 = userInput.nextLine();

                try {
                    num1 = Integer.parseInt(numberInput1);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num1 == 1) {
                    return 11;
                }
                if (num1 == 2) {
                    return 12;
                }
                if (num1 == 3) {
                    return 13;
                }
                if (num1 == 4) {
                    return 0;
                } else System.out.println("Invalid input!");

            }
            if (num == 2) {
                System.out.println("Which seedling u want to buy?");
                System.out.println("1. Cabbage - 15");
                System.out.println("2. Wheat - 15");
                System.out.println("3. Beetroot - 15");
                System.out.println("4. Return");

                int num2 = 0;
                Scanner userInput2 = new Scanner(System.in);
                String numberInput2 = userInput.nextLine();

                try {
                    num2 = Integer.parseInt(numberInput2);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num2 == 1) {
                    return 21;
                }
                if (num2 == 2) {
                    return 22;
                }
                if (num2 == 3) {
                    return 23;
                }
                if (num2 == 4) {
                    return 0;
                } else System.out.println("Invalid input!");
            }
            if (num == 3) {
                System.out.println("What u want to buy?");
                System.out.println("1. House - 500");
                System.out.println("2. Land - 300");
                System.out.println("3. Return");

                int num3 = 0;
                Scanner userInput3 = new Scanner(System.in);
                String numberInput3 = userInput.nextLine();

                try {
                    num3 = Integer.parseInt(numberInput3);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num3 == 1) {
                    return 31;
                }
                if (num3 == 2) {
                    return 32;
                }
                if (num3 == 3) {
                    return 0;
                } else System.out.println("Invalid input!");
            }
            if (num == 4) break;
            else {
                System.out.println("Invalid input!!");
            }
        }
        return 0;
    }

    public static int UserSecondChoice() {
        System.out.println("What do you want to sell?");
        System.out.println("1. Animal");
        System.out.println("2. Plant");
        System.out.println("3. Return");

        int num = 0;
        Scanner userInput = new Scanner(System.in);
        String numberInput = userInput.nextLine();

        try {
            num = Integer.parseInt(numberInput);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        while (true) {
            if (num == 1) {
                System.out.println("Which animal u want to sell?");
                System.out.println("1. Cow - 200");
                System.out.println("2. Pig - 100");
                System.out.println("3. Chicken - 40");
                System.out.println("4. Return");

                int num1 = 0;
                Scanner userInput1 = new Scanner(System.in);
                String numberInput1 = userInput.nextLine();

                try {
                    num1 = Integer.parseInt(numberInput1);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num1 == 1) {
                    return 11;
                }
                if (num1 == 2) {
                    return 12;
                }
                if (num1 == 3) {
                    return 13;
                }
                if (num1 == 4) {
                    return 14;
                } else System.out.println("Invalid input!");
            }
            if (num == 2) {
                System.out.println("Which seedling u want to sell?");
                System.out.println("1. Cabbage - 1500");
                System.out.println("2. Wheat - 5000");
                System.out.println("3. Beetroot - 800");
                System.out.println("4. Return");

                int num2 = 0;
                Scanner userInput2 = new Scanner(System.in);
                String numberInput2 = userInput.nextLine();

                try {
                    num2 = Integer.parseInt(numberInput2);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }

                if (num2 == 1) {
                    return 11;
                }
                if (num2 == 2) {
                    return 12;
                }
                if (num2 == 3) {
                    return 13;
                }
                if (num2 == 4) {
                    return 14;
                } else System.out.println("Invalid input!");
            }
            if (num == 3) break;

            else {
                System.out.println("Invalid input!!");
            }
        }
        return 0;
    }


    public static int NextRound(int weekNumber) {
        return weekNumber + 1;
    }

    private static void GameWinnerCheck(Player player1) {
        if (player1.salary > 5000) {
            System.out.println("You won! You are perfect and rich farmer!");
        }
    }

    public static void AnimalBuy(int playerSalary)
    {
        if(playerSalary > 0)
        {

        }

    }

    public static void AnimalSell(int playerSalary)
    {

    }

    public static void PlantBuy(int playerSalary)
    {

    }

    public static void PlantSell(int playerSalary)
    {

    }
}
