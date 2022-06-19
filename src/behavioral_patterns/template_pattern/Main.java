package part2.template;

import part2.state.StateLeft;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);

        Stack stack = new Stack(list);
        System.out.println("Stack:" + stack.toString());



        Queue queue = new Queue(list);
        System.out.println("Queue:" +queue.toString());

    }
}
