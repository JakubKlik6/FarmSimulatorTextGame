package Plants;

import Animals.Animals;

public class Beetroot extends Seedlings implements seallable{
    public Integer landPrepCost = 10;
    public Integer protectCost = 5;
    public Integer tonsOfBeets = 3;
    public Integer lengthOfMaturation = 10;
    public Integer costOfHarvest = 100;
    public Integer sellPrice = 8;

    public Beetroot() {
    }


    @Override
    public void sell(Animals age) {

    }
}
