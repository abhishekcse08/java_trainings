import java.util.LinkedList;
import java.util.Queue;

public class QueueAssignments {
    public static void main(String[] args) {


        Queue<String> que = new LinkedList<>();
        que.add("test1");
        que.add("test2");
        que.add("test3");
        que.add("test4");
        System.out.println(que);
        que.remove();
        System.out.println(que);
    }
}
