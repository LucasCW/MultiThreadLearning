package andb;

public class B {
	private A a;
	public B(A a) {
		this.a = a;
	}
	
	public void setA(A a) {
		this.a = a;
	}
	
	public void something() {
		System.out.println("B");
		a.something();
	}
}
