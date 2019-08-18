
public class B extends A {
	
	public B() {
		System.out.println("B");
	}

	public B(int i) {
		super(i);
		System.out.println("B " + i);
	}
}
