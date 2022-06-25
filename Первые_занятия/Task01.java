// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите число a: ");
        // if (iScanner.hasNextInt()){
        int a = iScanner.nextInt(); 
        System.out.println("Спасибо! Вы ввели число " + a);
        // } else {
        // System.out.println("Извините, что-то пошло не так!");
        // }

        System.out.printf("Введите число b: ");
        // if (iScanner.hasNextInt()){
        int b = iScanner.nextInt(); 
        System.out.println("Спасибо! Вы ввели число " + b);
        // } else {
        // System.out.println("Извините, что-то пошло не так!");
        // }
        System.out.printf("%d ^ %d = %f", a, b, Math.pow(a,b));
        iScanner.close();
    } 
    
}
