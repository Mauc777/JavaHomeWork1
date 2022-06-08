
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



    // Код Ивана П.
    // public static void move (char pos1, char pos2) {// Сначала рассмотрим, как двигаться, когда есть только одна пластина
    //     System.out.print (pos1 + "==>" + pos2 + ""); // непосредственно перемещаем пластину в целевую область
    //     }
        
    //     public static void hanio(int n,char pos1,char pos2,char pos3) {
    //     if(n == 1) {
    //     move(pos1,pos3);
    //     } else {
    //     hanio(n-1,pos1,pos3,pos2);
    //     move(pos1,pos3);
    //     hanio(n-1,pos2,pos1,pos3);
    //     }
         