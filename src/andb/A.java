package andb;

public class A {
	
	private B b;

	public A() {
		b = new B(this);
		
	}
	
	
	public B getB() {
		return b;
	}
	
	public void something() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		A a = new A();
		
		a.something();
		a.b.something();
		
		
		
	}

}
