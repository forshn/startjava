public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("");
        }
        boolean isMaleSex = true;
        if (isMaleSex) {
            System.out.println("Это мужчина");
        }
        if (!isMaleSex) {
            System.out.println("Это женщина");
        }

        float height = 1.93F;
        if (height < 1.80) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост выше среднего");
        }

        char firstLetterName = 'I';
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается с М");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается с I");
        } else {
            System.out.println("Имя начинается ни с M, ни с I");
        }
    }
}


