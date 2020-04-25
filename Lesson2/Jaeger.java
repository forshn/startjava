public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getName() {
        return modelName;
    }

    public void powerMove() {
        if (weight > 2.55) {
            System.out.println("Bums");
        } else {
            System.out.println("Piu");
        }
    }

    public void move(int x) {
        if (speed > 5 && x > 10) {
            System.out.println("RUN!");
        } else {
            System.out.println("Walk");
        }
    }

    public void shot() {
        if (strength > 20) {
            System.out.println("Headshot");
        } else System.out.println("Shot down!");
    }
}

