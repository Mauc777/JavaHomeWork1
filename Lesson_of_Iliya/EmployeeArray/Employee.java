public class Employee{

    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    Employee(String fullName,
    String position,
    String email,
    String phoneNumber,
    float salary,
    int age
    ){
        this.fullName    = fullName;
        this.position    = position;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        this.salary      = salary;
        this.age         = age;
    }

    void printInfo(){
        System.out.println("ФИО" +fullName);
        System.out.println("Должность" +position);
        System.out.println("Имэйл" +email);
        System.out.println("Тел" +phoneNumber);
        System.out.println("Зарплата" +salary);
        System.out.println("Возрост" +age);
    }



}