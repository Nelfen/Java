package Chapter10;

public class InstanceofEx {
	public static void method1(ParentInst parent) {
		if(parent instanceof ChildInst) { //변환 가능 확인
			ChildInst child = (ChildInst) parent;
			System.out.println("method1-Child로 변환");
		} else {
			System.out.println("method1-Child로 실패");
		}
	}
	public static void method2(ParentInst parent) {
		ChildInst child = (ChildInst) parent; //예외발생가능
		System.out.println("method2-Child로 변환");
	}
	public static void main(String[] args) {
		ParentInst parentA = new ChildInst();
		method1(parentA);
		method2(parentA);
		ParentInst parentB = new ParentInst();
		method1(parentB);
		method2(parentB); //예외 발생
	}
}