// Минимально используя клласы попробовать решить одну из задач
import java.util.logging.*;
// Пример задачи:
// 1. Создать калькулятор для работы с рациональными и комплексными числами, 
//    организовать меню, добавив в неё систему логирования.
// Решение каждой задачи начинается с обсуждения, только после этого пишется код.

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Запуск Калькулятора, пристегнитесь!");

        int num1 = Vvod.getInt();
        int num2 = Vvod.getInt();
        char operation = ariFmeticOperations.getOperation();
        modelCalc Kalk = new modelCalc(num1,  operation,  num2);
        int  result;
        result = Kalk.caclc2( num1,  operation,  num2);
        System.out.println("Результ: = " + result);

        logger.info("Заверш раб программы, вы удовлетворены?");
        


    }

}
