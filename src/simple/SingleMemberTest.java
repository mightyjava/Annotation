package simple;

import java.lang.annotation.Annotation;

@SingleMemberAnnotation(100)
public class SingleMemberTest {
	
	//@SingleMemberAnnotation(100)
	public static void testAnnotation() {
		/*try {
			Method method = SingleMemberTest.class.getMethod("testAnnotation");
			SingleMemberAnnotation singleMemberAnnotation = method.getAnnotation(SingleMemberAnnotation.class);
			System.out.println(singleMemberAnnotation.value()); 
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}*/
		
		Annotation annotation = SingleMemberTest.class.getAnnotation(SingleMemberAnnotation.class);
		SingleMemberAnnotation memberAnnotation = (SingleMemberAnnotation) annotation;
		System.out.println(memberAnnotation.value());
	}
	
	public static void main(String[] args) {
		testAnnotation();
	}
}
