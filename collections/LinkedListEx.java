package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Yoga");
		l.add("Keerthi");
		l.add("Anjali");
		//Collections.sort(l);
		System.out.println("Linked: "+l);
		l.remove("Yoga");
		System.out.println("Deleting String" +l);
		l.removeFirst();
		System.out.println("Updating String" +l);
		
		
		
		// TODO Auto-generated method stub

	}

}
