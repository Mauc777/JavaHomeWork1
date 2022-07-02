public class Bird extends Animal {

    int height; 
    
    Bird(String name, String color, int age, int height){
        super(name, color, age);
        this.height = height;
    }

    @Override
    public void voice(){
        System.out.println(name + " мяу!");
    }

    public void walk(){
        System.out.println(name + " Ходит на лапках! ");
    }

    
}
