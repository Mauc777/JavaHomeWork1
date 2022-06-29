// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class Ferzin {
    static int[] doska = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int index = 0;
    static int version = 0;

    public static void main(String[] args) {
        
        do{
            if(checking1()) {
                if(index ==7) {
                    System.out.println(version++ +"[0=]" + doska[0]+ "[1]=" + 
                        doska[1] +"[2=]" + doska[2]+ "[3]=" + doska[3] +"[4]=" + doska[4] + "[5]=" + doska[5] +
                        "[6]=" + doska[6] +"[7]=" + doska[7]);
                    doska[index]++;
                }
                else{
                    index++;
                }

            }
            else {
                doska[index]++;
            }
        } while (doska[0]<8);
    }

    static boolean checking1() {
        int i;

        if(index ==0) {
            return true;
        }
        
        if (doska[index]>7) {
            doska[index] = 0;
            index--;
            return false;
        }

        for(i=0;i<index;i++) {
            // if((doska[index]==doska[i]) |(Math.abs(doska[index]- doska[i])) == (index-i))){
            if((doska[index] == doska[i])|((Math.abs(doska[index] - doska[i])) == (index-i))){
                return false;
            }
        }

        return true;
    }    
}    
        
   
