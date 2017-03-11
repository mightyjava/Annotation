package simple;

import java.lang.reflect.Method;

public class MarkerTest {

	/**
	 * just to check is annotation is present or not
	 */
	@MarkerAnnotation
	public static void testAnnotation() {
		try {
			Method method = MarkerTest.class.getMethod("testAnnotation");
			System.out.println(method.isAnnotationPresent(MarkerAnnotation.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testAnnotation();
	}
}
