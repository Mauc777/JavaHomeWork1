import HumanAll.Person;
import RelationshipAll.Relationship;
import ResearchAll.Research2;
import TreeOfHuman.GeoTree;

public class Pro {
    public static void main(String[] args) {
        var irina = new Person("Ирина", "Жен");
        var vasya = new Person("Вася", "Муж");
        var masha = new Person("Маша", "Жен");
        var jane = new Person("Женя", "Жен");
        var ivan = new Person("Иван", "Муж");

        GeoTree gt = new GeoTree();
        gt.appendParent(irina, vasya);
        gt.appendParent(irina, masha);
        gt.appendChild(jane, irina);
        gt.appendChild(ivan, irina);

        // NewGeoTree ngt = new NewGeoTree();
        // var repo = new Repository(new FileList());
        // repo.pd(irina, masha);
        System.out.println(new Research2(gt).spend(irina, Relationship.children));

        System.out.println("----------------------------------");

        System.out.println(new Research2(gt).spend(masha, Relationship.parent));

    }

}
