package Properties;

import Properties.Farm;

public class Player {
public Integer salary = 1000;
public Farm farm;
public String playerName;

    public Player(String playerName, Integer salary, Farm farm) {
        this.salary = salary;
        this.farm = farm;
        this.playerName = playerName;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Your goods" +
                "\nSalary: " + salary +
                "\n" + farm +
                "\nName: " + playerName;
    }
}
