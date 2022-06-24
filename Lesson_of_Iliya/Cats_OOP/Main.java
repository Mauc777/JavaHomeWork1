package Lesson_of_Iliya.Cats_OOP;


public class Main 
{
    public static void main(String[] args) 
    {
        Cat firstCat = new Cat("Васька",2013,"Серая");
        // firstCat.age = 8;
        // firstCat.color = "Серая";
        // firstCat.name = "Васька";

        Cat secondCat = new Cat("Мышкин", "Белый");
        // secondCat.age = 3;
        // secondCat.color = "Белый";
        // secondCat.name = "Мышкин";

        System.out.println(firstCat.getAge() + " " +firstCat.getName() + " " +  firstCat.getColor());
        System.out.println(secondCat.getAge() + " " +secondCat.getName() + " " +  secondCat.getColor());
        
        firstCat.jump();
        secondCat.voice();

        firstCat.meet(secondCat);
        secondCat.meet(firstCat);


    
        
    }
    
}
