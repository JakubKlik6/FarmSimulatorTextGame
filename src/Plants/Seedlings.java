package Plants;

import Properties.Land;

public class Seedlings extends Land {
    private static final String DEF_SEED_NAME = "Weed";
    private static final Integer DEF_SEED_PRICE = 20;
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

    public void GetPrice()
    {
        System.out.println(seedPrice);
    }
}
