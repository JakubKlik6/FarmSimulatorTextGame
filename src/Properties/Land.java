package Properties;

public class Land extends Farm{
    private static final Integer DEF_LAND_SIZE = 100;
    private static final Integer DEF_LAND_PRICE = 150;
    public Integer numberOfPlants = DEF_LAND_SIZE;
    public Integer landPrice = DEF_LAND_PRICE;

    public Land(Integer numberOfPlants, Integer landPrice) {
        this.numberOfPlants = numberOfPlants;
        this.landPrice = landPrice;
    }

    public Land() {
    }

    @Override
    public String toString() {
        return "Land size " + numberOfPlants + " , landPrice " + landPrice;
    }

    public void NumberOfPlantsCheck()
    {
        if (this.numberOfPlants <= 0)
        {
            System.out.println("You don't have enough space");
        }
    }
}
