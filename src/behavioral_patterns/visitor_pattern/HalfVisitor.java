package part2.visitor;

public class HalfVisitor implements Visitor {
    public void visit(Object o){

    }
    public void visit(LeafNode leaf){
        leaf.setValue(leaf.getValue() / 2);
    }
    public void visit(InternalNode leaf){
    }
}
