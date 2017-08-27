package webDriverMethods;

public class B extends A {

	public void  m1()
	{
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new B();
		
		B.m2(a1);
		
	}
	
	public static void m2(A a1)
	{
		a1.m1();
	}
	

}
