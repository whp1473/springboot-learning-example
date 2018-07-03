package org.spring.springboot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by houping wang on 2018/6/8
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(10);
            add(12);
            add(4);
            add(4);
        }};
        Double sum = list.parallelStream().mapToDouble((data)->data/2).sum();
        System.out.println(sum);
    }
}
