import java.util.Objects;
public class Flower {
     public String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, String nameFlower) {
        this(nameFlower, country, cost, 3, nameFlower);
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan, String nameFlower) {
        this.nameFlower = nameFlower;
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country= "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        if (nameFlower != null && !nameFlower.isEmpty() && !nameFlower.isBlank()) {
            this.nameFlower = nameFlower;
        } else {
            this.nameFlower = "белый";
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country= "Россия";
        }
    }

    public double getCost() {
        return cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }



    public void setCost(double cost) {
        if (cost < 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
    }
    @Override
    public String toString() {
        return "Название растения - " + nameFlower + ", цвет - "+flowerColor+", страна происхождения: "+ country +
                ", стоимость : " + cost + " рублей, срок стояния цветка - " + lifeSpan+ " дня.";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && nameFlower.equals(flower.nameFlower) && flowerColor.equals(flower.flowerColor) && country.equals(flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFlower, flowerColor, country, cost, lifeSpan);
    }

}
