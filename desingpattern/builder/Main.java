package desingpattern.builder;

public class Main {
        public static void main(String[] args) {
                // Build a house with a garage and garden
                House house1 = new House.HouseBuilder(4, 2)
                                .setGarage(true)
                                .setGarden(true)
                                .build();
                System.out.println(house1);

                // Build a house with a swimming pool
                House house2 = new House.HouseBuilder(6, 3)
                                .setSwimmingPool(true)
                                .build();
                System.out.println(house2);

                // Build a basic house with only windows and doors
                House house3 = new House.HouseBuilder(2, 1)
                                .build();
                System.out.println(house3);
        }
}
