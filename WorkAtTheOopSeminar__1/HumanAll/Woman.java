package HumanAll;
public class Woman extends Person {
    String name;
    String fullName; 
    
    
    public Woman(String fullName) {
        super(fullName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}    
    


// @Override
// public void voice(){
//     System.out.println("Прииивееетики, ребатки");
// }


// @Override
// public void greet(){
//     System.out.println("Привееет) ");
// }


