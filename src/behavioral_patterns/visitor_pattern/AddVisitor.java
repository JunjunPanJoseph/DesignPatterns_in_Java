package part2.visitor;

public class AddVisitor implements Visitor {
    private int number;
    public AddVisitor(int number){
        this.number = number;
    }
    @Override
    public void visit(Object o) {

    }

    @Override
    public void visit(LeafNode leaf) {
        leaf.setValue(leaf.getValue() + number);
    }

    @Override
    public void visit(InternalNode node) {

    }
}
