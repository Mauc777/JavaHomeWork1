public class Snake extends Animal {
    Snake(String name, String color, int age){
        super(name, color, age);
        
    }


    // Переопределение логики хождение в ползание
    @Override
    public void walk(){
        System.out.println(name+ " ползет");
    }


    @Override
    public void voice(){
        System.out.println(name + "TTTTCCCCCCC");
    }


}
