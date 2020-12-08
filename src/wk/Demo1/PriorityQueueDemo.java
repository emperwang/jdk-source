package wk.Demo1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: wk
 * @Date: 2020/12/8 11:22
 * @Description
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,3,5,6,7,8,9));
        queue.add(4);
    }
}
