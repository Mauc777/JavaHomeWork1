public class Main {

    public static void main(String[] args) {
        
    

    // Dog dog = new Dog("Тузик", "Черный", 5);
    // Bird bird = new Bird("Орлик", "Серый", 4 , 15);
    // Cat cat = new Cat("Пусик", "Белая", 2);
    // Parrot parrot = new Parrot("Полли", "Волнистый", 2,3);
    // Parrot p = new Parrot("asas", "dsd", 5, 8);
    // Snake snake = new Snake("Аруа", "svv", 5);

    Animal dog = new Dog("Тузик", "Черный", 5);
    Animal bird = new Bird("Орлик", "Серый", 4 , 15);
    Animal cat = new Cat("Пусик", "Белая", 2);
    Animal parrot = new Parrot("Полли", "Волнистый", 2,3);
    Animal snake = new Snake("Аруа", "svv", 5);

    Animal[] zoo = {dog,bird,cat,parrot, snake};
    
    for (Animal animal : zoo) {
        animal.voice();
    }
    
}
    public static void  callVoiceFrom(Animal[] animals){

        // animals[3].speak();  -->> обратиться напрямую не можем т к 
        //  speak() описан в Parrot, а не в Animal!!!


        for (Animal animal : animals) {

    //          объект           Тип Данных
            if (animal instanceof Parrot){

                // Приведение ТИПОВ 
                //   (Parrot) -->> тип Данных к которому приводим наш объект (Parrot)
                //    animal -->> сам приводимый объект

                Parrot p1 = (Parrot) animal;
                p1.speak();  //когда мы провалимся в if, то сможем работать с Parrot от экз p1 !!
                            //  а не только как с животным Animal
            }

            animal.voice();
            
        }
    
}

 
}
