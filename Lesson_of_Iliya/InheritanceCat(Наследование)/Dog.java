public class Dog extends Animal {


    Dog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void voice(){
        System.out.println(name + " мяу!");
    }

    public void walk(){
        System.out.println(name + " Ходит на лапках! ");
    }
    
}
