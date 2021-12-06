package Chapter10;

public class ChildCastingEx {

	public static void main(String[] args) {
		ParentCasting parent = new ChildCasting();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		ChildCasting child = (ChildCasting)parent;
		child.field2 = "data2";		
		child.method3();			
	}

}