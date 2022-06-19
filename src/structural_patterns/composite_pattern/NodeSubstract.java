package composite_patterns;

public class NodeSubstract  extends NodeBinary{
    public NodeSubstract(){
        super();
    }
    public NodeSubstract(Node left, Node right){
        super(left, right);
    }
    @Override
    public double evaluate() {
        return this.getLeft().evaluate() - this.getRight().evaluate();
    }
}
