package frameworks;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueEx {

	public static void main(String[] args) {
		Deque<Integer> qq=new ArrayDeque<Integer>();
		qq.offerFirst(7);
		qq.offerFirst(8);
		qq.offerLast(9);
		System.out.println(qq);
	}

}
