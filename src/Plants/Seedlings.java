package Plants;

public abstract class Seedlings {
    private static final String DEF_SEED_NAME = "Weed";
    private static final Integer DEF_SEED_PRICE = 15;
    private static final Integer DEF_SEED_AGE = 1;
    public String seedName = DEF_SEED_NAME;
    public Integer seedPrice = DEF_SEED_PRICE;
    public Integer seedAge = DEF_SEED_AGE;

    public Seedlings() {
    }

    public Seedlings(String seedName, Integer seedPrice, Integer seedAge) {
        this.seedName = seedName;
        this.seedPrice = seedPrice;
        this.seedAge = seedAge;
    }
}
