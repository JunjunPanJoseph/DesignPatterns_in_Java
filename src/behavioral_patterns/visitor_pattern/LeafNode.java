package part2.visitor;

public class LeafNode implements Node {
    private int value;
    public LeafNode(int value){
        this.value = value;
    }
    public int getSum(){
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
