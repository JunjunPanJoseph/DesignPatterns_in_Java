package part2.template;

import java.util.List;

public class Stack extends TemplateLinearDataStructure {
    private int index;

    public Stack(List<Integer> list) {
        super(list);
    }

    @Override
      public int getNext() {
        return get(index--);
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public void reset() {
        index = list.size() - 1;
    }
}
