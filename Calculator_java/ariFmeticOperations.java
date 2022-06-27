
import java.util.Scanner;

public class ariFmeticOperations {

    // Метод вычисляет какую арифметическую операцию необх. исполнить
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка, введи еще раз:  ");
            scanner.next(); // рекурсия ??
            operation = getOperation();

        }
        return operation;
        // Scanner.close();
    }

}
