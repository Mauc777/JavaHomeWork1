import java.util.Scanner;

public class Vvod {
    // Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод числа: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка, попробуй еще раз.");
            scanner.next(); // Рекурсия?
            num = getInt();
        }
        return num;
    }

}
