public class Wolf {
    String sex = "мужской";
    String name = "Олег Владимирович";
    float weight = 14.4F;
    int age = 5;
    String color = "серый";

    void move() {
        System.out.println("Вы идёте");
    }
    void sit() {
       System.out.println("Вы сели");
    }
    void run() {
       System.out.println("Вы бежите");
    }
    void bark() {
       System.out.println("Гав-гав");
    }
    boolean hunting() {
       System.out.println("Вы начали охоту");
       return(true);
    }
}


