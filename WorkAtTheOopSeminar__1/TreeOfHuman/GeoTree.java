package TreeOfHuman;

import java.util.ArrayList;

import NodeAll.*;
import HumanAll.*;
import RelationshipAll.*;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendParent(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.children, children));
        //
    }

    public void appendChild(Person children, Person parent) {
        tree.add(new Node(children, Relationship.parent, parent));
    }

    // попытка добавления связи брат сестра в ту и обратную сторону
    // public void appendBroSisters(Person brother, Person sister){
    // tree.add(new Node(brother, Relationship.children, sister));
    // tree.add(new Node(sister, Relationship.children, sister));

    // }

    public void getTree(ArrayList<Node> tree) {
        this.tree = tree;
    }

}
