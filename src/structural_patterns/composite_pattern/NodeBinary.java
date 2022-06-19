package composite_patterns;

public abstract class NodeBinary implements Node {
    private static Node Nill = new NodeDecimal(0);
    private Node left;
    private Node right;
    public NodeBinary(){
        this.left = Nill;
        this.right = Nill;
    }

    public NodeBinary(Node left, Node right){
        this.left = left;
        this.right = right;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public Node getLeft(){return left;}
    public Node getRight(){return right;}
}
