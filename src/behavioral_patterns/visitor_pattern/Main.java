package part2.visitor;

public class Main {
    public static void main(String[] args) {
        Node complexNode = new InternalNode(new InternalNode(new LeafNode(10), new LeafNode(20)), new LeafNode(30));
        System.out.println("Complex node sum: " + complexNode.getSum());
        Visitor halfVisitor = new HalfVisitor();
        complexNode.accept(halfVisitor);
        System.out.println("Sum after visit: " + complexNode.getSum());
        Visitor add5Visitor = new AddVisitor(5);
        complexNode.accept(add5Visitor);
        System.out.println("Sum after +5 visit: " + complexNode.getSum());
        AverageVisitor averageVisitor = new AverageVisitor();
        complexNode.accept(averageVisitor);
        System.out.println("Sum / #Nodes = " + averageVisitor.getAverage());
    }
}
