package Animals;

import Properties.Player;

public abstract class Animals {
    private static final Double DEF_ANIMAL_PRICE = 25.0;
    private static final Integer DEF_ANIMAL_AGE = 1;
    public Double animalPrice = DEF_ANIMAL_PRICE ;
    public Integer animalAge = DEF_ANIMAL_AGE;
    public Integer animalSize = 1;

    public Animals(Double animalPrice, Integer animalAge) {
        this.animalPrice = animalPrice;
        this.animalAge = animalAge;
    }

    public Animals() {
    }

}
