// Минимально используя клласы попробовать решить одну из задач

// Пример задачи:
// 1. Создать калькулятор для работы с рациональными и комплексными числами, 
// организовать меню, добавив в неё систему логирования.
// Решение каждой задачи начинается с обсуждения, только после этого пишется код.

public class Main {

    public static void main(String[] args) {
        int num1 = Vvod.getInt();
        int num2 = Vvod.getInt();
        char operation = ariFmeticOperations.getOperation();

        modelCalc Kalk = new modelCalc(num1,  operation,  num2);
        int  result;
        // result = Kalk.caclc2(num1, operation, num2);
        result = Kalk.caclc2( num1,  operation,  num2);
        System.out.println("Результ: = " + result);

    }

}
