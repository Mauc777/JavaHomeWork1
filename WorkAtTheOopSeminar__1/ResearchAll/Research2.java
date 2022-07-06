package ResearchAll;

import java.util.ArrayList;
import HumanAll.Person;
import NodeAll.Node;
import RelationshipAll.Relationship;
import TreeOfHuman.*;

public class Research2 {

  ArrayList<Node> tree;

  public Research2(GeoTree geoTree) {
    tree = geoTree.getTree();
  }

  // проведи
  public ArrayList<Person> spend(Person p, Relationship re) {
    var result = new ArrayList<Person>();

    for (Node t : tree) {
      if (t.p1.getName() == p.getName() && t.re == re) {
        result.add(t.p2);
      } else {
        System.out.println("Родитель или ребенок неизвестен");
      }

    }
    return result;

  }
}
