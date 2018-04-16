package ecnu.mySpringMVC.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//创建自己的Controller，它只能标注在类上面
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

	/**
	 * 表示给controller注册别名
	 * @return
	 */
	String value() default "";
	
}
