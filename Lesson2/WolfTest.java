public class WolfTest {
    public static void main(String[] args) {

        Wolf wolfOne = new Wolf();

        /* wolfOne.move();
        wolfOne.bark();
        wolfOne.hunting();
        wolfOne.run();
        wolfOne.sit();*/

        wolfOne.setName("Геннадий");
        System.out.println("Имя волка - " + wolfOne.getName());

        wolfOne.setSex("Бесполый");
        System.out.println("Пол волка - " + wolfOne.getSex());

        wolfOne.setWeight(19.5F);
        System.out.println("Вес волка - " + wolfOne.getWeight() + "кг");

        wolfOne.setAge(10);
        System.out.println("Возарст волка - " + wolfOne.getAge() + "лет");

        wolfOne.setColor("Чёрный");
        System.out.println("Цвет волка - " + wolfOne.getColor());

    }
}
