import java.util.*;
public class Bouquet {
        private double cost;
        private int lifeSpan;
        private List<Flower> flowers = new ArrayList<>();

        public double getCost() {
            return cost;
        }

        public int getLifeSpan() {
            return lifeSpan;
        }

        public Bouquet addFlower(Flower flower) {
            flowers.add(flower);
            cost += flower.getCost() + (flower.getCost() / 100 * 10);
            lifeSpan = Integer.MAX_VALUE;
            for (Flower f : flowers) {
                if (f.getLifeSpan() < lifeSpan) {
                    lifeSpan = f.getLifeSpan();
                }
            }

            return this;

        }

}


