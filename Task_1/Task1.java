package Task_1;
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

import java.io.*;

public class Task1{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader
                (new FileReader("C:/Users/Kozan/Desktop/Java/JavaHomeWorkBelovik/JavaHomeWork1/Task_1/input.txt"));
        String bLine = br.readLine();
        String aLine = br.readLine();
        br.close();

        String bValue = bLine.substring(2);
        int b = Integer.parseInt(bValue);

        String aValue = aLine.substring(2);
        int a = Integer.parseInt(aValue);

        // возведение в степень 
        String resDel;
        if (a==0 && b==0) {
            resDel = "не определен";
        } else{
        double res = Math.pow(a, b);
        String resultStr = String.valueOf(res);
        resDel = resultStr.replace(".0", "");
        }

        FileWriter fw = 
            new FileWriter("C:/Users/Kozan/Desktop/Java/JavaHomeWorkBelovik/JavaHomeWork1/Task_1/output.txt", false);

        // fw.write(String.format("%.0f", res));
        fw.write(resDel);
        fw.close();
        
    }
}