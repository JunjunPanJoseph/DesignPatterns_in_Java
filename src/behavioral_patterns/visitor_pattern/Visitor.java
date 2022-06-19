package part2.visitor;

import part2.visitor.InternalNode;
import part2.visitor.LeafNode;

public interface Visitor {
    void visit(Object o);
    void visit(LeafNode leaf);
    void visit(InternalNode node);
}
