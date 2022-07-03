package Первые_занятия;

public class КОллекции_функционал {
    
}
// clear() – очистка списка

// toString() – «конвертация» списка в строку

// Arrays.asList – преобразует массив в список

// containsAll(col) – проверяет включение всех элементов из col

// removeAll(col) – удаляет элементы, имеющиеся в col

// retainAll(col) – оставляет элементы, имеющиеся в col

// toArray() – конвертация списка в массив Object’ов

// toArray(type array) – конвертация списка в массив type

// List.copyOf(col) – возвращает копию списка на основе имеющегося

// List.of(item1, item2,...) – возвращает неизменяемый список
// ________________________________________________________________________

// import java.util.List;



// public class Ex006_ListOf {

//    public static void main(String[] args) {

//        Character value = null;

//        List<Character> list1 = 

//            List.of('S', 'e', 'r', 'g', 'e', 'y');

//        System.out.println(list1);

//        // list1.remove(1); // java.lang.UnsupportedOperationException

//        List<Character> list2 = List.copyOf(list1);



//    }

// }

// ИТЕРАТОР
// import java.util.*;

// public class Ex007_Iterator {

//    public static void main(String[] args) {

//        List<Integer> list = List.of(1, 12, 123, 1234, 12345);



//        for (int item : list) { System.out.println(item); }

//        Iterator<Integer> col = list.iterator();



//        while (col.hasNext()) {

//            System.out.println(col.next());

//        }

//    }

// }


