package com.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 壳子
* @ClassName: Annotation01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Mr.Dong
* @date 2017年7月14日 下午5:25:38
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Annotation01 {
 
}
