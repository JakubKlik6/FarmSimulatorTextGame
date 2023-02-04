public class Player extends Farm {
private Double salary = 1000.0;
public Farm farm;
public String playerName;

    public Player(String playerName, Double salary, Farm farm) {
        this.salary = salary;
        this.farm = farm;
        this.playerName = playerName;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "salary=" + salary +
                ", farm=" + farm +
                ", playerName='" + playerName + '\'' +
                ", farmPrice=" + farmPrice +
                ", numberOfHouses=" + numberOfHouses +
                '}';
    }
}
