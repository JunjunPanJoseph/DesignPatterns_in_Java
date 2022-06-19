package composite_patterns;

public class Test {
    public static void main(String[] args) {
        Node tree = new NodeAdd(
                        new NodeSubstract(
                                new NodeDecimal(10),
                                new NodeDecimal(5)
                        ),
                        new NodeAdd(
                                new NodeDecimal(1),
                                new NodeDecimal(2)
                        )
                    );
        Node smallTree = new NodeDecimal(5);
        System.out.println("Small tree eval: " + smallTree.evaluate());
        System.out.println("Large tree eval: " + tree.evaluate());


    }


}
