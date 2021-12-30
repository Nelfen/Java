package Chapter17;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); 					//interfaceA는 methodA만 실행가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); 					//interfaceB는 methodB만 실행가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();					//interfaceC는 모두 호출가능
		ic.methodB();
		ic.methodC();
	}
}