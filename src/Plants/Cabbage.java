package Plants;

import Animals.Animals;

public class Cabbage extends Seedlings implements seallable{
    public Integer landPrepCost = 10;
    public Integer protectCost = 10;
    public Integer tonsOfCabbage = 5;
    public Integer lengthOfMaturation = 15;
    public Integer costOfHarvest = 150;
    public Integer sellPrice = 1500;

    public Cabbage() {
    }

    @Override
    public void sell(Animals age) {

    }
}
