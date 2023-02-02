import java.util.concurrent.ThreadLocalRandom;

public class Farm {
    private static final Integer DEFAULT_NUMBER_OF_HOUSES = 1;
    private static final Double DEFAULT_FARM_PRICE = 50.0;

    public Double farmPrice = DEFAULT_FARM_PRICE;
    public Integer numberOfHouses = DEFAULT_NUMBER_OF_HOUSES;

    public Farm(Double farmPrice, Integer numberOfHouses) {
        this.farmPrice = farmPrice;
        this.numberOfHouses = numberOfHouses;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return "Price = " + farmPrice + ", Number of houses = " + numberOfHouses;
    }
}

