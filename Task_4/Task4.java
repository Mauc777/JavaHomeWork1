// Обозначим через «1-2» такое действие: переложить диск или с 1-го штыря на 2-й, или со 2-го на 1-й, 
// в зависимости от того, где он меньше. Тогда, чтобы решить головоломку с чётным количеством дисков,
//  надо многократно повторять действия: 1-2, 1-3, 2-3.
//  Если число дисков нечётно — 1-3, 1-2, 2-3.
package Task_4;
public class Task4 {
    public static void main(String[] args) {
        Sort(1,2,3,3);
    }
    static void Sort(int from, int to, int other, int count){
        System.out.printf("%d -> %d\n", from,other);
        if(count>0){
        if(from>other)Sort(other,to,from,count-1);
        if(from>to)Sort(to,from,other,count-1);
        if(other>to)Sort(from,other,to,count-1);
        }
    }  
    }



    // 11