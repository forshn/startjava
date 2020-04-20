public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Вы создали волка по имени " + wolfOne.name);
        System.out.println("Его пол - " + wolfOne.sex);
        System.out.println("Вес волка " + wolfOne.weight + " килограмм");
        System.out.println("Возраст волка - " + wolfOne.age + " лет");
        System.out.println("Цвет " + wolfOne.color);
        wolfOne.move();
        wolfOne.bark();
        wolfOne.hunting();
        wolfOne.run();
        wolfOne.sit();
    }
}
