public class Main {
    public static void main(String[] args) {
        
        // Создание массива из Сотридников
        Employee[] employees = {
            new Employee( "sfswv",  "sdvs",  "sdvsd",  "sdsdc",  15,  45),
            new Employee("v", "sdc", "email", "sd",  5, 39),
            // new Employee(fullName, position, email, phoneNumber, salary, age),
            // new Employee(fullName, position, email, phoneNumber, salary, age),
            // new Employee(fullName, position, email, phoneNumber, salary, age)
        
        };


        int minAge = 40;


        // С помощью цикла выведем всехз работников с возростом старше 40
        for (Employee employee : employees) {
            if (employee.age > minAge){
                employee.printInfo();
                System.out.println();
            }
            
        }
    }
    
}
