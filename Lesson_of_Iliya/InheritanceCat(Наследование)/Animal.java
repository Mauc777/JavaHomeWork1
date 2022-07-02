public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    

    Animal(String name, String color, int age){
        this.name = name;
        this.color =  color;
        this.age = age;

    }

    public void walk(){
        System.out.println(name + " Ходит на лапках! ");
    }

    public abstract void voice();

}
