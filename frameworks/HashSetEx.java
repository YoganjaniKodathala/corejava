package frameworks;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name=new HashSet<String>();
		name.add("Keerthi");
		name.add("Prudhvi");
		name.add("Yoga");
		System.out.println(name);
		name.add("uma");
		System.out.println(name);
		System.out.println("Retrive data using iterator ");
		Iterator<String> itr=name.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

	private Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
