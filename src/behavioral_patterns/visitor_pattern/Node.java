package part2.visitor;

public interface Node {
    int getSum();
    void accept(Visitor visitor);
}
