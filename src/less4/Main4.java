package less4;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

//        GBStack stack = new GBStack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack.peek());

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> res = new ArrayList<>();

        GBStack s1 = new GBStack();
        GBStack s2 = new GBStack();

        for (Integer i : list) {
            s1.push(i);
            s2.push(s1.pop());
        }

        for (int i = 0; i < list.size(); i++) {
            res.add(s2.pop());
        }

        System.out.println(res);
    }
}
