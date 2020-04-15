public class ConditionalStatement {
  public static void main(String[] args){
    int age = 21;
    boolean ismaleSex = true;
    float height = 1.93F;
    char firstLetterName = 'I';
    if (age > 20) {
      System.out.println ("");
    }
    if (ismaleSex = true) {
      System.out.println("Это мужчина");
    }
    if (ismaleSex != true) {
      System.out.println("Это женщина");
    }
    if (height < 1.80) {
      System.out.println ("Рост ниже среднего");
    } else {
     System.out.println("Рост выше среднего");
    }
     if (firstLetterName == 'M') {
      System.out.println("Имя начинается с М");
    } else if(firstLetterName == 'I') {
      System.out.println("Имя начинается с I");
    } else {
      System.out.println("Имя начинается ни с M, ни с I");
    }
  }
}
