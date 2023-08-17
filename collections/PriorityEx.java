package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Learner {
	int rno;
	String name;

	public Learner(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Learner [rno=" + rno + ", name=" + name + "]";
	}

	class SortByname implements Comparator<Learner> {

		@Override
		public int compare(Learner o1, Learner o2) {
			// TODO Auto-generated method stub
			return 0;
		}

		

		
	}
}

public class PriorityEx {
	public static void main(String[] args) {

		PriorityQueue<Learner> p = new PriorityQueue<Learner>();
		p.add(new Learner(11, "Yoga"));
		p.add(new Learner(12, "Keerthi"));
		for (int i = 0; i <= 1; i++) {
			System.out.println(p.get(i));

		}
	}
}
