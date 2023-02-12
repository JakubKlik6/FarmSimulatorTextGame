package Animals;

import Properties.House;

public class Animals extends House {
    private static final Double DEF_ANIMAL_PRICE = 25.0;
    private static final Integer DEF_ANIMAL_AGE = 1;
    public Double animalPrice = DEF_ANIMAL_PRICE ;
    public Integer animalAge = DEF_ANIMAL_AGE;

    public Animals(Double animalPrice, Integer animalAge) {
        this.animalPrice = animalPrice;
        this.animalAge = animalAge;
    }

    public Animals() {
    }

}
