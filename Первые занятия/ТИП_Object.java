// долгое выполнение , но рабочее
// Приступать к данному механизму упаковки и распаковки нужно в крайних случаях!!!
public class ТИП_Object {
    public static void main(String[] args) {
        
        static Object Sum(Object a, Object b) {
            if (a instanceof Double && b instanceof Double) {
                return (Object) ((Double)a + (Double)b);
            } else if (a instanceof Integer && b instanceof Integer) {
                return (Object) ((Integer)a + (Integer)b);   
            }else return 0;       
    }
}
