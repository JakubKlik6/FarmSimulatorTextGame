package Properties;

import Animals.Animals;

import java.util.concurrent.ThreadLocalRandom;

public class Farm extends Player {
    private static final Double DEFAULT_FARM_PRICE = 50.0;

    public Double farmPrice = DEFAULT_FARM_PRICE;
    public House house;
    public Land land;

    public Farm(Double farmPrice, House house, Land land) {
        this.farmPrice = farmPrice;
        this.house = house;
        this.land = land;
    }

    public Farm(Double farmPrice) {
        this.farmPrice = farmPrice;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return ", House capacity " + house.houseCapacity + " , Land size " + land.numberOfPlants + "Number of animals " + "Number of plants ";
    }

}

