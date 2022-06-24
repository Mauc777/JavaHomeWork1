package Task_4;

// в зависимости от того, где он меньше. Тогда, чтобы решить 
// головоломку с чётным количеством дисков,
//  надо многократно повторять действия: 1-2, 1-3, 2-3.
//  Если число дисков нечётно — 1-3, 1-2, 2-3.


// ToDOO Завершить после разбора 4ой лекции!! Она важнеее!!
public class Task4 {

    public static void main(String[] args) {
        Muve aN = new Muve(3);  
        // an.setN(3);
        aN.getN();
        System.out.println("Колец => " +aN.getN());

        Muve aSp1 = new Muve(1);
        aSp1.getN();
        System.out.println("Стартовый шпиль => " +aSp1.getN());

        Muve bSp2 = new Muve(1);
        bSp2.getN();
        System.out.println("Стартовый шпиль => " +bSp2.getN());

        Muve cSp3 = new Muve(2);
        cSp3.getN();
        System.out.println("Финишный шпиль => " +cSp3.getN());

        Muve(aN,aSp1, bSp2,cSp3);
        
    }

    
    static double  MuveS(Muve an, Muve bS ,Muve cF) {
        if(an.getN()==1){
            return MuveS(an, bS, cF);
        } 
        else {
            return TempOritMo(6, 3, 2);
            
        }

        
    
    static double TempOritMo(int Temp1, int bS, int cF){
        int tmp = 0;
        tmp = (Temp1 - bS- cF);
        return tmp;
        }
        if (n == 1){
            System.out.printf("%d ", n , Start1 ,  Finish1);
        } 
        else Muve(n-1, Start, Finish1); {
            System.out.printf("%d " + "%d " + "%d ", n,  Start1, Finish1);
            int Temp1 =  6 - Start1 - Finish1;
            Muve(n-1, Temp1, Finish1);
        }
    }        
}
