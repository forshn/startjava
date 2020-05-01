package com.startjava.lesson2_3.wolf;


public class Wolf {
    private String sex = "мужской";
    private String name = "Олег Владимирович";
    private float weight = 14.4F;
    private int age = 5;
    private String color = "серый";

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age <= 8 && age > 0) {
            this.age = age;
        } else {
        System.out.println("Некорректный возраст");
          }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void move() {
        System.out.println("Вы идёте");
    }

    public void sit() {
       System.out.println("Вы сели");
    }

    public void run() {
       System.out.println("Вы бежите");
    }

    public void bark() {
       System.out.println("Гав-гав");
    }

    public boolean hunting() {
       System.out.println("Вы начали охоту");
       return(true);
    }
}


