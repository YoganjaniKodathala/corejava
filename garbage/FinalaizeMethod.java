package garbage;
	public class FinalaizeMethod 
	{
		String s;
	public FinalaizeMethod(String s) {
		this.s = s;
	}
	public static void main(String[] args) {
		FinalaizeMethod t1 = new FinalaizeMethod("t1");
		FinalaizeMethod t2 = new FinalaizeMethod("t2");
		t1 = t2;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}
}


