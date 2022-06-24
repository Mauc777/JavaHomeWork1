package Lesson_of_Iliya.Cats_OOP;

public class Cat {

    // Поля класса
    private String name;
    String color;
    // int age;
    private int yearOfBirth;

    public Cat(String name, int yearOfBirth, String color) 
    {
        // Cat this
        this.name  = name;
        // this.age   = age;
        this.color = color;
        this.yearOfBirth = yearOfBirth;
    }

    Cat(String name, String color)
    {
        this.name = name;
        this.yearOfBirth = 2021;
        this.color = color;
    }

    void meet(Cat cat)
    {
        System.out.println(this.name +  "  and  "  + cat.name);
    }


    void voice()
    {
        System.out.println(name + "meow");
    }
    
    void jump()
    {
        System.out.println(name + "jump");
    }



    /*
     * getColor()  и setColor()
     * являются СВОЙСВАМИ полей класса Cat!!!!!!!!!
     */
    String getColor()
    {
        return color;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    // Имя 
    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }



    // Свойство ( говоря с натяжкой)
    int getAge()
    {
        return 2021 - yearOfBirth;
    }
}
