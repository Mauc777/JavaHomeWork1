// Написать программу вычисления n-ого треугольного числа.
// (n * (n+1))/2

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите изначальную точку(число) треуг-числа");
        
        try {
        int number = sc.nextInt();
        System.out.println(" " + getNumber(number));
        } catch (Exception e) {
            System.out.println("важе треугольное число = " + e.getMessage());
    }}
    
    public static int getNumber(int number){
            int  result = (number * (number+1))/2;
            return result;
    }

}    
    
