public class Main {
     public static void printFlower(Flower flower) {
        System.out.println("Название растения - "+flower.getNameFlower()+", цвет - "+flower.getFlowerColor()+", страна" +
                " происхождения: "+flower.getCountry()+", цена за один цветок: "+flower.getCost()+" руб., срок стояни" +
                "я - "+flower.getLifeSpan()+" дней.");
    }
    public static void main(String[] args) {
         //ООП. Урок 2 (инкапсуляция) Домашнее задание 1 Задание 2 "Создайте новый класс flower."

        Flower rose = new Flower("", "Голландия", 35.59,"Роза");
        Flower chrysanthemum = new Flower("", "", 15.0, 5,"Хризантема");
        Flower pion = new Flower("", "Англия", 69.9, 1,"Пион");
        Flower gypsophila = new Flower("", "Турция", 19.50, 10,"Гипсофила");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        rose.setFlowerColor("  ");
//        chrysanthemum.setFlowerColor(null);
//        chrysanthemum.setCountry("");
//        pion.setFlowerColor("    "+"   ");
//        pion.setCost(-25);
//        gypsophila.setFlowerColor("желтый");
//        gypsophila.setCountry("     ");
//        System.out.println(rose);
//        System.out.println(chrysanthemum);System.out.println(pion);
//       System.out.println(gypsophila);
        printFlower(rose);
        printFlower(pion);
        printFlower(chrysanthemum);
        printFlower(gypsophila);



        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose).addFlower(rose).addFlower(rose).addFlower(gypsophila).addFlower(chrysanthemum).
                addFlower(chrysanthemum).addFlower(chrysanthemum).addFlower(chrysanthemum).addFlower(chrysanthemum);
        System.out.println("Стоимость букета "+ bouquet.getCost());
        System.out.println("Срок стояния букета "+ bouquet.getLifeSpan());
    }
}