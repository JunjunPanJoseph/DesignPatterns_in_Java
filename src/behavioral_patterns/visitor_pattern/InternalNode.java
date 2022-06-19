package part2.visitor;

public class InternalNode implements Node {
    private Node left;
    private Node right;
    public InternalNode(Node left, Node right){
        this.left = left;
        this.right = right;
    }
    @Override
    public int getSum() {
        int sum = 0;
        if (left != null){
            sum += left.getSum();
        }
        if (right != null){
            sum += right.getSum();
        }
        return sum;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        left.accept(visitor);
        right.accept(visitor);
    }
}
