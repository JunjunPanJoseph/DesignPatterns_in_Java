package part2.template;

import java.util.List;

public class Queue extends TemplateLinearDataStructure {
    private int index;
    public Queue(List<Integer> list) {
        super(list);
    }

    @Override
    public int getNext() {
        return get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public void reset() {
        index = 0;
    }
}
