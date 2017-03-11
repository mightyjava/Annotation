package simple;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface MultipleMemberAnnotation {
	int method1() default 10000;

	String method2() default "method2";
}
