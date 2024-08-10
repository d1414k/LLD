package desingpattern.builder;

public class House {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    // Private constructor to force the use of the Builder
    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors +
                ", hasGarage=" + hasGarage + ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }

    // Static nested class Builder
    public static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public HouseBuilder(int windows, int doors) {
            this.windows = windows;
            this.doors = doors;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // The build method to return a fully constructed House object
        public House build() {
            return new House(this);
        }
    }
}
