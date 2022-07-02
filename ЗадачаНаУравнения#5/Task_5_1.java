// +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Arrays;
public class Task_5_1 {
        public static void main(String[] args) {
            String input = "2? + ?5 = 69";

            //удалить пробелы, если они есть
            input = input.replace(" ", "");

            // считать вопросительные знаки
            int questionCount = getQuestionCount(input);
            int[] vector = new int[questionCount];
            Arrays.fill(vector, 0);

            // перебрать всю комбинацию векторов от 0..0 до 9..9 и проверить уравнение
            boolean found = false;
            boolean finish = false;
            while (!finish) {
                String equation = replQuest(input, vector);
                if (isValid(equation)) {
                    System.out.println(equation);
                    found = true;
                }

                boolean changed = rVektor(vector);
                if (!changed) {
                    finish = true;
                }
            }
            if (!found) {
                System.out.println("Нет возможности получить правильное уравнение " + input);
            }
        }

        private static boolean isValid(String equation) {
            // parse as q+w=e, split on + or =
            String[] parts = equation.split("\\+|=");

            int q = Integer.parseInt(parts[0]); 
            int w = Integer.parseInt(parts[1]); 
            int e = Integer.parseInt(parts[2]); 
            
            return q + w == e;
        }

        private static String replQuest(String input, int[] vector) {
            char[] chars = input.toCharArray();
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '?') {
                    chars[i] = Character.forDigit(vector[index], 10);
                    index++;
                }
            }
            return new String(chars);
        }

        private static boolean rVektor(int[] vector) {
            for (int i = 0; i < vector.length; i++) {
                int digit = vector[i];
                if (digit < 9) {
                    vector[i] = digit + 1;
                    return true;
                }
                vector[i] = 0;
            }
            return false;
        }

        private static int getQuestionCount(String input) {
            int count = 0;
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '?') {
                    count++;
                }
            }
            return count;
        }

}
    

