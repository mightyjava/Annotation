package meta;

import java.lang.annotation.Annotation;

public class MainClass {
	
	public static void main(String[] args) {
		Annotation annotation = Child.class.getAnnotation(InheritedAnnotation.class);
		InheritedAnnotation inheritedAnnotation = (InheritedAnnotation) annotation;
		System.out.println(inheritedAnnotation.value());
	}
}

//same way can implement for other type of element also and other annotation also
