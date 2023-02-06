package Plants;

import Animals.Animals;

public class Wheat extends Seedlings implements seallable{
    public Integer landPrepCost = 25;
    public Integer protectCost = 15;
    public Integer tonsOfWheat = 15;
    public Integer lengthOfMaturation = 30;
    public Integer costOfHarvest = 500;
    public Integer sellPrice = 20;

    public Wheat() {
    }

    @Override
    public void sell(Animals age) {

    }
}
