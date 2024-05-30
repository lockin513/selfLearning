import java.util.ArrayDeque;
import java.util.Queue;

public class implement_stack_using_queues {
    class MyStack {
        Queue<Integer> queue;

        public MyStack() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            queue.add(x);
        }

        public int pop() {
            int size = queue.size();
            while(size-->1)queue.add(queue.poll());
            return queue.poll();
        }

        public int top() {
            int size = queue.size();
            while(size-->1)queue.add(queue.poll());
            int ans = queue.peek();
            queue.add(queue.poll());
            return ans;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
