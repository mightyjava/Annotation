package simple;

import java.lang.reflect.Method;

public class MutlipleMemberTest {
	
	@MultipleMemberAnnotation(method1 = 20000, method2 = "methodTwo")
	public static void testAnnotation() {
		try {
			Method method = MutlipleMemberTest.class.getMethod("testAnnotation");
			MultipleMemberAnnotation memberAnnotation = method.getAnnotation(MultipleMemberAnnotation.class);
			System.out.println(memberAnnotation.method1()); 
			System.out.println(memberAnnotation.method2());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testAnnotation();
	}
}
