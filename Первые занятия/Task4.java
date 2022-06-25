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



    

