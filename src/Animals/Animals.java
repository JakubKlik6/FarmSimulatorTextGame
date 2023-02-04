package Animals;

public abstract class Animals {
    private static final Double DEF_ANIMAL_PRICE = 25.0;
    private static final String DEF_ANIMAL_SPECIE = "Dog";
    private static final Integer DEF_ANIMAL_AGE = 1;
    public String speciesOfAnimal = DEF_ANIMAL_SPECIE;
    public Double animalPrice = DEF_ANIMAL_PRICE ;
    public Integer animalAge = DEF_ANIMAL_AGE;

    public Animals(String speciesOfAnimal, Double animalPrice, Integer animalAge) {
        this.speciesOfAnimal = speciesOfAnimal;
        this.animalPrice = animalPrice;
        this.animalAge = animalAge;
    }

    public Animals() {
    }
}
