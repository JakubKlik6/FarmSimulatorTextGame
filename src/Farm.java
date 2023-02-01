import java.util.concurrent.ThreadLocalRandom;

public class Farm {
    private static final Double DEFAULT_FARM_SIZE = 75.0;
    private static final Integer DEFAULT_NUMBER_OF_HOUSES = 1;
    private static final Double DEFAULT_FARM_PRICE = 50.0;

    public Double farmPrice = DEFAULT_FARM_PRICE;
    public Double farmSize = DEFAULT_FARM_SIZE;
    public Integer numberOfHouses = DEFAULT_NUMBER_OF_HOUSES;

    public Farm(Double farmPrice, Double farmSize, Integer numberOfHouses) {
        this.farmPrice = farmPrice;
        this.farmSize = farmSize;
        this.numberOfHouses = numberOfHouses;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return "Price = " + farmPrice + ", Size=" + farmSize + ", Number of houses = " + numberOfHouses;
    }
}

