
public class modelCalc {
   int a;
   int b;
   char operation;

   public  modelCalc(int valueA, char valueOperation, int valueB) {
      this.a = valueA;
      this.operation = valueOperation;
      this.b = valueB;
   }

   public static int caclc2(int a, char operation, int b) {
      int result;
      switch (operation) {
         case '+':
            result = Addition(a, b);
            System.out.printf("%d +  %d = %d ", a , b , a+b);
            break;
         case '-':
            result = Substruction(a, b);
            System.out.printf("%d -  %d = %d ", a , b, a- b );
            break;
         case '*':
            result = Multiplication(a, b);
            System.out.printf("%d *  %d = %d ", a , b, a* b );
            break;
         case '/':
            result = Division(a, b);
            System.out.printf("%d /  %d = %d ", a , b, a / b );
            break;
         default:
            System.out.println("Повтори ввод ");
            result = caclc2(a, operation, b);

      }
      return result;
   }

   // Сложение  == Addition
   public static int Addition(int a, int b) {
      // System.out.printf("%d + %d = %d", a, b, a + b);
      return a + b;
      
   }
   
   // Вычитание == Subtraction
   public static int Substruction(int a, int b) {
      // System.out.printf("a = %d + b = %d = %d", a, b, a - b);
      return a - b;
   }

   // Умножение == Multiplication
   public static int Multiplication(int a, int b) {
      // System.out.printf("%d + %d = %d", a, b, a * b);
      return a * b;
   }

   // Деление == Division
   public static int Division(int a, int b) {
      // System.out.printf("%d + %d = %d", a, b, a / b);
      return a / b;
   }

   // void getValuA(int a)
   // {
   // this.a = a;
   // }
   // void setValueA(int a)
   // {
   // this.a = a;
   // }

   // void getValueB(int b)
   // {
   // this.b = b;
   // }
   // void setValueB(int b)
   // {
   // this.b = b;
   // }

   // void getValueOperation(char operation) {
   //    this.operation = operation;
   // }

   // void setValueOperation(char operation) {
   //    this.operation = operation;
   // }

}


