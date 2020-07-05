package composite_patterns;

public class NodeAdd extends NodeBinary{

    public NodeAdd(){
        super();
    }

    public NodeAdd(Node left, Node right){
        super(left, right);
    }

    @Override
    public double evaluate() {
        return this.getLeft().evaluate() + this.getRight().evaluate();
    }
}
