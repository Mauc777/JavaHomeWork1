// import java.util.ArrayList;

// public class Program {
// public static void main(String[] args) {

// Person natasha = new Person("Саша");
// Person alex = new Person("Машенька");
// Person mary = new Person("Петя");
// Person n021 = new Person("Вася");
// Person n022 = new Person("Ира");
// Person n011 = new Person("Марина");

// natasha.appendToFamily(alex);
// natasha.appendToFamily(mary);
// alex.appendToFamily(n011);
// mary.appendToFamily(n021);
// mary.appendToFamily(n022);

// Research(natasha, "");
// }

// static void Research(Person root, String sp) {
// if (root != null) {
// System.out.println(sp + root.fullName);

// for (Person item : root.getFamily()) {
// Research(item, sp + " ");
// }
// }
// }
// }

// class Person {

// public String fullName;

// private ArrayList<Person> family = new ArrayList<>();
// public ArrayList<Person> getFamily() {
// return family;
// }

// public void appendToFamily(Person p) {
// family.add(p);
// }

// public Person(String fullName) {
// this.fullName = fullName;
// }

// @Override
// public String toString() {
// return fullName;
// }

// }
