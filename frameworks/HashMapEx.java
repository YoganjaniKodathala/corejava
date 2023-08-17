package frameworks;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "abc");
		hm.put(2, "abc");
		hm.putIfAbsent(2, "pqr");
		System.out.println(hm);

	}

}
