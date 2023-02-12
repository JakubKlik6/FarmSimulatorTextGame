package Properties;
import Animals.*;

public class House extends  Farm{
    private static final Integer DEFAULT_HOUSE_SIZE = 50;
    private static final Integer DEFAULT_HOUSE_PRICE = 50;
    public Integer houseCapacity = DEFAULT_HOUSE_SIZE;
    public Integer price = DEFAULT_HOUSE_PRICE;
    public Cow cow;
    public Chicken chicken;
    public Pig pig;

    public House(Integer houseCapacity, Integer price, Cow cow, Chicken chicken, Pig pig) {
        this.houseCapacity = houseCapacity;
        this.price = price;
        this.cow = cow;
        this.chicken = chicken;
        this.pig = pig;
    }

    public House(Integer houseCapacity, Integer price) {
        this.houseCapacity = houseCapacity;
        this.price = price;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House size " + houseCapacity + ", price " + price;
    }

    public void CapacityCheck() {
        if (this.houseCapacity <= 0) {
            System.out.println("You don't have enough space");
        }
    }

}
