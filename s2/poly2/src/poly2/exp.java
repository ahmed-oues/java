package poly2;
class A {
	public String f(D obj) {
		return ("A et D");
	}
	public String f(A obj) {
		return ("A et A");
	}
}

class B extends A{
	public String f(B obj) {
		return ("B et B");
	}
	public String f(A obj) {
		return ("B et A");
	}
}

class C extends B{};
class D extends B{};


public class exp {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		
		System.out.println("1 : "+ a1.f(b));//1
		System.out.println("2 : "+a1.f(c));//2
		System.out.println("3 : "+a1.f(d));//3
		System.out.println("4 : "+a2.f(b));//4
		System.out.println("5 : "+a2.f(c));//5
		System.out.println("6 : "+a2.f(d));//6
		System.out.println("7 : "+b.f(b));//7
		System.out.println("8 : "+b.f(c));//8
		System.out.println("9 : "+b.f(d));//9
	
	}

}
