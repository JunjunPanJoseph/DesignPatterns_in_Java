package composite_patterns;

public class NodeDecimal implements Node{
    private double val;
    public NodeDecimal(double val){
        this.val = val;
    }

    @Override
    public double evaluate() {
        return val;
    }
}
