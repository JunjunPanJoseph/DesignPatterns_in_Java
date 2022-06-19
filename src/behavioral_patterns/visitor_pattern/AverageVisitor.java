package part2.visitor;

public class AverageVisitor implements Visitor {
    private int count;
    private int sum;
    public void reset(){
        count = 0;
        sum = 0;
    }
    public double getAverage(){
        return sum / count;
    }
    @Override
    public void visit(Object o) {
    }

    @Override
    public void visit(LeafNode leaf) {
        count += 1;
        sum += leaf.getValue();
    }

    @Override
    public void visit(InternalNode node) {
        count += 1;
    }
}
