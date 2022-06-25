import java.util.ArrayList;



public class Коллекции {
    public static void main(String[] args) {
        

        // Объявление ArrayList
        ArrayList <Integer>list  = new ArrayList<Integer>();
        list.add(2809);
        for(Object o : list) {
            System.out.println(o);
        }

        // ArrayList, LinkedList,(Vector,Stack  - устаревшие)

        // Варианты создания коллекций
        // ArrayList <Integer> list1 = new ArrayList<Integer>();
        // ArrayList <Integer> list2 = new ArrayList();
        // ArrayList <Integer> list3 = new ArrayList<>(10);
        // ArrayList <Integer> list4 = new ArrayList<>(list3);

    }
    
}
