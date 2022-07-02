public class Parrot extends Bird{

    Parrot(String name, String color, int age, int height){
        super(name, color, age, height);
    }


    
    void speak(){
        System.out.println(name + "Хочу крекер!");
    }  
}
