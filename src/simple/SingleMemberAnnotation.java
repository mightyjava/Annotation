package simple;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
// so like can use field, method, constructor
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleMemberAnnotation {
	int value() default 0;
}
