public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimson = new Jaeger("Cherno Alfa", "Mark-1", "Russia", 85.34F, 2.34F, 3, 10, 10);
        System.out.println(crimson.getName());
        crimson.powerMove();
        crimson.move(9);
        crimson.shot();

        Jaeger brawler = new Jaeger("Brawler", "Mark-1", "USA", 33.56F, 2.66F, 11, 21, 7);
        System.out.println(brawler.getName());
        brawler.powerMove();
        brawler.move(11);
        brawler.shot();
    }
}
