package meta;

@InheritedAnnotation("hello child")
public class Child extends Parent {
	@Override
	public void method() {
		System.out.println("Child Method");
	}
}
